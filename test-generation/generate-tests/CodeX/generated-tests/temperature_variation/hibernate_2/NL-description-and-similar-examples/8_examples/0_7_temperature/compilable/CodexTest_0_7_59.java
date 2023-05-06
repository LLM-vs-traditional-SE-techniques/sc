import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_59 { 
  @Test
    public void testFromString() {
        BooleanTypeDescriptor descriptor = new BooleanTypeDescriptor();
        assertEquals(Boolean.TRUE, descriptor.fromString("true"));
        assertEquals(Boolean.FALSE, descriptor.fromString("false"));
        assertNull(descriptor.fromString(null));
    }
}