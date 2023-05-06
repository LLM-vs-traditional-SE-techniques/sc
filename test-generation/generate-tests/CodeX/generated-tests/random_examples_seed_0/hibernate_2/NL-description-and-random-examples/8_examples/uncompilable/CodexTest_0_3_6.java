import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_6 { 
  @Test
    public void testBooleanFromString() {
        Boolean b = Boolean.fromString("true");
        assertTrue(b.booleanValue());
        b = Boolean.fromString("false");
        assertFalse(b.booleanValue());
        b = Boolean.fromString("TRUE");
        assertTrue(b.booleanValue());
        b = Boolean.fromString("FALSE");
        assertFalse(b.booleanValue());
    }
}