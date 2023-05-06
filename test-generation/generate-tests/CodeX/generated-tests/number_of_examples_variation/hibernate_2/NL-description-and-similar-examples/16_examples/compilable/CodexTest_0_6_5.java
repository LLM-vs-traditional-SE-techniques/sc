import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_5 { 
  @Test
    public void testFromString() {
        assertNull(BooleanTypeDescriptor.INSTANCE.fromString(null));
        assertFalse(BooleanTypeDescriptor.INSTANCE.fromString("false"));
        assertTrue(BooleanTypeDescriptor.INSTANCE.fromString("true"));
    }
}