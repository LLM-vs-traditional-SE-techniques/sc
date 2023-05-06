from translation.context import CodeContext
from parsing.java import parser, type_solver

import jpype.imports
from com.github.javaparser.ast.body import *
from com.github.javaparser.ast.stmt import *
from com.github.javaparser.ast.expr import *
from com.github.javaparser.symbolsolver.javaparsermodel.declarations import *
from com.github.javaparser.resolution.declarations import *


def contextualize_node(node, context):
    """
    This function takes an AST node and embeds it into the given context, expanding package names and field accesses in the process.
    E.g. a field access of the form "field" will become "this.field" if non-static or "packageName.className.field" if static, similarly with method calsl.
    """
    node = context.embed_expr(node)

    # This is a hack to work around the limitations of JavaParser. JavaParser is not able to discern if something refers to a package,
    #  referenced_classesis to keep track of the involved packages to resolve them "manually"
    # unresolved_nodes contains the nodes that we cannot resolve, for example if JavaParser thinks "java" is a variable
    # At the end we can check if the unsolved_nodes are a package name. Only if it isn't, we truly have other problems and cannot provide contextualization.
    unsolved_nodes = []
    referenced_classes = []

    # First we contextualize all method calls
    calls = node.findAll(MethodCallExpr)
    for call in calls:
        # We expect all calls to resolve so there is no try here
        try:
            resolved_call = call.resolve()
        except:
            return None

        referenced_classes.append(resolved_call.declaringType().getQualifiedName())

        # This first if deals with the special case of a package name being present but not fully qualified, e.g. 
        # e.g. Locale when called in java.util should be turned into java.util.Locale
        if call.getScope().isPresent():
            scope = call.getScope().get()

            try:
                # If we know what this is anyways, then we do not have to do guesswork and can skip it
                scope.resolve()
                continue
            except:
                # Handle class names of same package
                if scope.toString().equals(resolved_call.declaringType().getName()):
                    qualified_name = resolved_call.declaringType().getQualifiedName()
                    new_scope = parser.parseExpression(qualified_name)
                else:
                    continue

        elif resolved_call.isStatic():
            class_name = resolved_call.declaringType().getQualifiedName()

            new_scope = parser.parseExpression(class_name)
        else:
            new_scope = ThisExpr()

        call.setScope(new_scope)

    # This is just to gather referenced packages and also qualify unqualified package names when accessing fields.
    # This wouldn't be necessary if JavaParser wouldn't treat stuff like java.util as a field access with util being the field and java the "object".
    field_accesses = node.findAll(FieldAccessExpr)
    for access in field_accesses:
        try:
            resolved_access = access.resolve()

            referenced_classes.append(resolved_access.declaringType().getQualifiedName())

            scope = access.getScope()

            try:
                # If we know what this is anyways, then we do not have to do guesswork and can skip it
                scope.resolve()
                continue
            except:
                # Handle class names of same package
                # e.g. Locale when called in java.util should be turned into java.util.Locale
                if scope.toString().equals(resolved_access.declaringType().getName()):
                    qualified_name = resolved_access.declaringType().getQualifiedName()
                    new_scope = parser.parseExpression(qualified_name)

                    access.setScope(new_scope)
        except:
            import traceback
            #print(traceback.format_exc())
            unsolved_nodes.append(access.toString())

    # Finally we can qualify/contextualize fields and arguments
    names = node.findAll(NameExpr)
    for name in names:
        try:
            resolved_name = name.resolve()

            if isinstance(resolved_name, ResolvedFieldDeclaration):
                referenced_classes.append(resolved_name.getType().getQualifiedName())
                if resolved_name.isStatic():
                    class_name = resolved_name.getType().getQualifiedName()
                    node = replace_in_root(node, name, FieldAccessExpr(parser.parseExpression(
                        class_name), name.getName().toString()))
                else:
                    node = replace_in_root(node, name, FieldAccessExpr(
                        ThisExpr(), name.getName().toString()))
        except:
            unsolved_nodes.append(name.toString())

    def can_solve_node(node):
        for qualified_name in referenced_classes:
            if str(qualified_name).startswith(str(node)):
                return True

        return False

    # What we couldn't solve as a variable, field or method is a package name (OR package + class name).
    # If we didn't see that during some resolution, it's invalid
    if all(map(can_solve_node, unsolved_nodes)):
        return node
    else:
        return None
