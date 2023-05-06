import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_6 { 
  @Test
    public void testBooleanFromString() {
        assertEquals(Boolean.FALSE, Boolean.fromString("false"));
        assertEquals(Boolean.FALSE, Boolean.fromString("no"));
        assertEquals(Boolean.FALSE, Boolean.fromString("off"));
        assertEquals(Boolean.FALSE, Boolean.fromString("0"));
        assertEquals(Boolean.TRUE, Boolean.fromString("true"));
        assertEquals(Boolean.TRUE, Boolean.fromString("yes"));
        assertEquals(Boolean.TRUE, Boolean.fromString("on"));
        assertEquals(Boolean.TRUE, Boolean.fromString("1"));
        assertEquals(Boolean.TRUE, Boolean.fromString("t"));
        assertEquals(Boolean.TRUE, Boolean.fromString("y"));
        assertEquals(Boolean.TRUE, Boolean.fromString("1"));
        assertEquals(Boolean.TRUE, Boolean.fromString("-1"));
        assertEquals(Boolean.TRUE, Boolean.fromString("2"));
        assertEquals(Boolean.TRUE, Boolean.fromString("-2"));
        assertEquals(Boolean.TRUE, Boolean.fromString("3"));
        assertEquals(Boolean.TRUE, Boolean.fromString("-3"));
        assertEquals(Boolean.TRUE, Boolean.fromString("4"));
        assertEquals(Boolean.TRUE, Boolean.fromString("-4"));
        assertEquals(Boolean.TRUE, Boolean.fromString("5"));
        assertEquals(Boolean.TRUE, Boolean.fromString("-5"));
        assertEquals(Boolean.TRUE, Boolean.fromString("6"));
        assertEquals(Boolean.TRUE, Boolean.fromString("-6"));
        assertEquals(Boolean.TRUE, Boolean.fromString("7"));
        assertEquals(Boolean.TRUE, Boolean.fromString("-7"));
        assert
}