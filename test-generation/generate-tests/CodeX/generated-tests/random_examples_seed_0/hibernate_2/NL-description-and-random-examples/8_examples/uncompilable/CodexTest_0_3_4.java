import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_4 { 
  @Test
    public void testFromString() {
        assertEquals(Boolean.FALSE, Boolean.fromString("false"));
        assertEquals(Boolean.TRUE, Boolean.fromString("true"));
        assertEquals(Boolean.FALSE, Boolean.fromString("False"));
        assertEquals(Boolean.TRUE, Boolean.fromString("True"));
        assertEquals(Boolean.FALSE, Boolean.fromString("FALSE"));
        assertEquals(Boolean.TRUE, Boolean.fromString("TRUE"));
        assertEquals(Boolean.FALSE, Boolean.fromString("no"));
        assertEquals(Boolean.TRUE, Boolean.fromString("yes"));
        assertEquals(Boolean.FALSE, Boolean.fromString("NO"));
        assertEquals(Boolean.TRUE, Boolean.fromString("YES"));
        assertEquals(Boolean.FALSE, Boolean.fromString("n"));
        assertEquals(Boolean.TRUE, Boolean.fromString("y"));
        assertEquals(Boolean.FALSE, Boolean.fromString("N"));
        assertEquals(Boolean.TRUE, Boolean.fromString("Y"));
        assertEquals(Boolean.FALSE, Boolean.fromString("0"));
        assertEquals(Boolean.TRUE, Boolean.fromString("1"));
        assertEquals(Boolean.FALSE, Boolean.fromString("off"));
        assertEquals(Boolean.TRUE, Boolean.fromString("on"));
        assertEquals(Boolean.FALSE, Boolean.fromString("OFF"));
        assertEquals(Boolean.TRUE, Boolean.fromString("ON"));
        assertEquals(Boolean.FALSE, Boolean.fromString("off"));
        assertEquals(Boolean.TRUE, Boolean.fromString("on"));
        assertEquals(Boolean.FALSE, Boolean.fromString("OFF"));
        assertEquals(Boolean.TRUE, Boolean.fromString("ON"));
        assertEquals(Boolean.F
}