import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_7 { 
  @Test
    public void testFromString() {
        assertNull(Boolean.fromString(null));
        assertTrue(Boolean.fromString("true").booleanValue());
        assertFalse(Boolean.fromString("false").booleanValue());
    }
}