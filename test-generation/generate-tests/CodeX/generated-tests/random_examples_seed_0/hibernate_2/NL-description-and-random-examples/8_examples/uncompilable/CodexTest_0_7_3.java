import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_3 { 
  @Test
    public void testFromString() {
        assertEquals(Boolean.TRUE, Boolean.fromString(Boolean.TRUE.toString()));
        assertEquals(Boolean.FALSE, Boolean.fromString(Boolean.FALSE.toString()));
        try {
            Boolean.fromString("");
            fail();
        } catch (IllegalArgumentException expected) {}
    }
}