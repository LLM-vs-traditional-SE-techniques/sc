import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_9 { 
  @Test
    public void testBooleanFromString() {
        assertTrue(Boolean.valueOf("true").equals(Boolean.TRUE));
        assertTrue(Boolean.valueOf("false").equals(Boolean.FALSE));
    }
}