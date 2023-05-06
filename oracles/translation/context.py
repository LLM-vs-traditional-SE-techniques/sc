import util
from parsing.java import parser

import jpype.imports
from com.github.javaparser.ast.body import *
from com.github.javaparser.ast.stmt import *
from com.github.javaparser.ast.expr import *

def get_decl_by_name(ast, name):
    genericless_name = name.split('<')[0].replace('$', '.')
    
    return util.find(ast.findAll(TypeDeclaration), lambda x: x.resolve().getQualifiedName() == genericless_name)
class CodeContext:
    """
    Utility, which given a method, can provide a way to create AST nodes properly contextualized in that method.
    This is achieved by embedding uncontextualized AST nodes in the method AST.
    """

    def __init__(self, code_dict, method):
        self.code_dict = code_dict
        self.method = method

        declaring_type = self._find_declaring_type(method)
        declaring_type_name = str(declaring_type.getPackageName()) + '.' + str(declaring_type.getClassName()).replace('.', '$')
        self._declaring_type_name = declaring_type_name
        self._compilation_unit_ast = self._get_compilation_unit_ast(declaring_type_name)
    
    def get_declaring_compilation_unit_ast(self):
        return self._compilation_unit_ast.clone()

    def get_declaring_class_ast(self):
        cu_ast = self.get_declaring_compilation_unit_ast()
        return get_decl_by_name(cu_ast, self._declaring_type_name)

    def _get_compilation_unit_ast(self, class_name):
        source = self.code_dict.find_source(class_name)
        ast = parser.parse(source)

        return ast

    def _get_class_ast(self, class_name):
        cu_ast = self._get_compilation_unit_ast(class_name)
        ast = get_decl_by_name(cu_ast, class_name)

        return ast

    def _find_declaring_type(self, method):
        decl = self._get_class_ast(method.class_name.name)
        
        def lookup(usage):
            try:
                method_signature = method.name
                # The name of the method should be in the signature
                # Easy way to improve speed by preventing resolution of signature
                if str(usage.getName()) not in method_signature:
                    return False

                x = usage.getQualifiedSignature()
                # This works because an unqualified signature is always a substring of a qualified one
                # We need the qualified signature since our parameters are qualified
                return method_signature in x
            except:
                import traceback
                #print(usage.toString())
                return False

        usage = util.find(decl.resolve().getDeclaredMethods(), lookup)

        if usage is None:
            usage = util.find(decl.resolve().getAllMethods(), lookup)
        
        return usage.declaringType()

    def get_method_ast(self):

        def lookup(decl):
            try:
                x = decl.resolve().getSignature()
                return x == self.method.name
            except:
                return False

        candidate_methods = self.get_declaring_class_ast().getMethodsByName(self.method.base_name)
        return util.find(candidate_methods, lookup)

    def embed_expr(self, expr):
        expr = expr.clone()
        method_ast = self.get_method_ast()

        # If we have methods in interfaces or abstract classes without a body, we add one
        body = method_ast.getBody().orElse(BlockStmt())
        body.getStatements().add(0, ExpressionStmt(expr))

        method_ast.setBody(body)

        return expr

    def embed_code_string(self, code):
        expr = parser.parseExpression(code)
        return self.embed_expr(expr)

class SourceCodeContext(CodeContext):

    def __init__(self, class_source, method_name):
        self.method_name = method_name
        self._class_ast = parser.parse(class_source)
        
    def get_method_ast(self):

        def lookup(decl):
            try:
                x = decl.resolve().getSignature()
                return x == self.method_name
            except:
                return False
        return util.find(self.get_declaring_class_ast().findAll(MethodDeclaration), lookup)
