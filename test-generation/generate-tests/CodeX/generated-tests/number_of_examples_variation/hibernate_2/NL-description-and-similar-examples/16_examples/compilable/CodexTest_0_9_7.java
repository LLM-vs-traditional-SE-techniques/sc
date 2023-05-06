import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_7 { 
  @Test
  public void testToStringAndFromString() {
        assertEquals("true", Boolean.TRUE.toString());
        assertEquals("false", Boolean.FALSE.toString());
        assertEquals(Boolean.TRUE, Boolean.valueOf("true"));
        assertEquals(Boolean.FALSE, Boolean.valueOf("false"));
    }
}