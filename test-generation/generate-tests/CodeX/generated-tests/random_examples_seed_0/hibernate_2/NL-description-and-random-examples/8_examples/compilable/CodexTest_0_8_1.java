import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_1 { 
  @Test
    public void testBoolFromString() {
        Boolean b1 = Boolean.FALSE;
        Boolean b2 = Boolean.TRUE;
        assertEquals(b1, Boolean.valueOf("FALSE"));
        assertEquals(b2, Boolean.valueOf("TRUE"));
    }
}