import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_1_3 { 
  @Test
    public void testToShort() {
        assertEquals(0, NumberUtils.toShort(Boolean.FALSE));
        assertEquals(1, NumberUtils.toShort(Boolean.TRUE));
        assertEquals(0, NumberUtils.toShort((Object) null));
        assertEquals(0, NumberUtils.toShort(""));
        assertEquals(0, NumberUtils.toShort("0"));
        assertEquals(1, NumberUtils.toShort("1"));
        assertEquals(0, NumberUtils.toShort("-0"));
        assertEquals(-1, NumberUtils.toShort("-1"));
        assertEquals(0, NumberUtils.toShort("false"));
        assertEquals(1, NumberUtils.toShort("true"));
        assertEquals(0, NumberUtils.toShort("null"));
        assertEquals(0, NumberUtils.toShort("NULL"));
        assertEquals(0, NumberUtils.toShort("\u0000"));
        assertEquals(0, NumberUtils.toShort("0.0"));
        assertEquals(0, NumberUtils.toShort("0.5"));
        assertEquals(1, NumberUtils.toShort("1.5"));
        assertEquals(0, NumberUtils.toShort("-0.0"));
        assertEquals(-1, NumberUtils.toShort("-0.5"));
        assertEquals(-1, NumberUtils.toShort("-1.5"));
        assertEquals(0, NumberUtils.toShort("0E10"));
        assertEquals(0, NumberUtils.toShort("0E-10"));
        assertEquals(0, NumberUtils.toShort("0E+10"));
        assertEquals(0, NumberUtils.toShort("0E10"));
        assertEquals(0, NumberUtils.toShort("0E-10"));
        assertEquals(0, NumberUtils.toShort("0E+10"));

}