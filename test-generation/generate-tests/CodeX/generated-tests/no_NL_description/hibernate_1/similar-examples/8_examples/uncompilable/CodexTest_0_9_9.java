import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
    public void testIsStringBoolean() {
        TypeDescriptor descriptor = StringBooleanTypeDescriptor.INSTANCE;
        assertTrue(descriptor.isAssignableTo(StringBooleanTypeDescriptor.INSTANCE));
        assertTrue(descriptor.isAssignableTo(CharacterBooleanTypeDescriptor.INSTANCE));
        assertTrue(descriptor.isAssignableTo(NumericBooleanTypeDescriptor.INSTANCE));
        assertTrue(descriptor.isAssignableTo(PrimitiveBooleanTypeDescriptor.INSTANCE));
        assertFalse(descriptor.isAssignableTo(ObjectTypeDescriptor.INSTANCE));
        assertFalse(descriptor.isAssignableTo(IntegerTypeDescriptor.INSTANCE));
        assertFalse(descriptor.isAssignableTo(BooleanTypeDescriptor.INSTANCE));
}