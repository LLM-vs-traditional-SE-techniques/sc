import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_2 { 
  @Test
    public void testBooleanFromString() {
        assertEquals(Boolean.TRUE, Boolean.fromString("true"));
        assertEquals(Boolean.FALSE, Boolean.fromString("false"));
    }
}