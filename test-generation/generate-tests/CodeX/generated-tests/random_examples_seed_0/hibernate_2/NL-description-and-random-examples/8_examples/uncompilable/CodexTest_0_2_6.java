import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_6 { 
  @Test
    public void testFromString() {
        assertEquals(Boolean.TRUE, Boolean.fromString("true"));
        assertEquals(Boolean.FALSE, Boolean.fromString("false"));
        assertEquals(Boolean.FALSE, Boolean.fromString("foo"));
        assertEquals(Boolean.FALSE, Boolean.fromString("TRUE"));
        assertEquals(Boolean.FALSE, Boolean.fromString("True"));
        assertEquals(Boolean.FALSE, Boolean.fromString("tRUE"));
        assertEquals(Boolean.FALSE, Boolean.fromString(""));
        assertEquals(Boolean.FALSE, Boolean.fromString(null));
    }
}