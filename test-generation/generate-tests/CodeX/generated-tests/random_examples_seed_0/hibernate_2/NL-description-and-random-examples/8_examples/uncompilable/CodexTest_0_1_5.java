import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_1_5 { 
  @Test
    public void testFromString() {
        assertEquals(Boolean.TRUE, Boolean.fromString("true"));
        assertEquals(Boolean.FALSE, Boolean.fromString("false"));
        assertEquals(Boolean.TRUE, Boolean.fromString("TRUE"));
        assertEquals(Boolean.FALSE, Boolean.fromString("FALSE"));
        assertEquals(Boolean.TRUE, Boolean.fromString("TrUe"));
        assertEquals(Boolean.FALSE, Boolean.fromString("FaLsE"));
        assertEquals(Boolean.TRUE, Boolean.fromString("t"));
        assertEquals(Boolean.FALSE, Boolean.fromString("f"));
        assertEquals(Boolean.TRUE, Boolean.fromString("T"));
        assertEquals(Boolean.FALSE, Boolean.fromString("F"));
        assertEquals(Boolean.TRUE, Boolean.fromString("y"));
        assertEquals(Boolean.FALSE, Boolean.fromString("n"));
        assertEquals(Boolean.TRUE, Boolean.fromString("Y"));
        assertEquals(Boolean.FALSE, Boolean.fromString("N"));
        assertEquals(Boolean.TRUE, Boolean.fromString("yes"));
        assertEquals(Boolean.FALSE, Boolean.fromString("no"));
        assertEquals(Boolean.TRUE, Boolean.fromString("YES"));
        assertEquals(Boolean.FALSE, Boolean.fromString("NO"));
        assertEquals(Boolean.TRUE, Boolean.fromString("on"));
        assertEquals(Boolean.FALSE, Boolean.fromString("off"));
        assertEquals(Boolean.TRUE, Boolean.fromString("ON"));
        assertEquals(Boolean.FALSE, Boolean.fromString("OFF"));
        assertEquals(Boolean.TRUE, Boolean.fromString("1"));
        assertEquals(Boolean.FALSE, Boolean.fromString("0"));
    }
}