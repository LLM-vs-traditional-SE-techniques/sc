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
        assertEquals(Boolean.TRUE, Boolean.valueOf("true"));
        assertEquals(Boolean.FALSE, Boolean.valueOf("false"));
        assertEquals(Boolean.TRUE, Boolean.valueOf("TRUE"));
        assertEquals(Boolean.FALSE, Boolean.valueOf("FALSE"));
        assertEquals(Boolean.TRUE, Boolean.valueOf("TrUe"));
        assertEquals(Boolean.FALSE, Boolean.valueOf("FaLsE"));
        assertEquals(Boolean.TRUE, Boolean.valueOf("t"));
        assertEquals(Boolean.FALSE, Boolean.valueOf("f"));
        assertEquals(Boolean.TRUE, Boolean.valueOf("T"));
        assertEquals(Boolean.FALSE, Boolean.valueOf("F"));
        assertEquals(Boolean.TRUE, Boolean.valueOf("1"));
        assertEquals(Boolean.FALSE, Boolean.valueOf("0"));
    }
}