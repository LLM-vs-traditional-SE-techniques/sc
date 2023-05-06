import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
    public void testBooleanFromString() {
        assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("false"));
        assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("true"));
        assertFalse(Boolean.TRUE.equals(BooleanTypeDescriptor.INSTANCE.fromString("foo")));
        assertFalse(Boolean.TRUE.equals(BooleanTypeDescriptor.INSTANCE.fromString("1")));
        assertFalse(Boolean.TRUE.equals(BooleanTypeDescriptor.INSTANCE.fromString("0")));
    }
}