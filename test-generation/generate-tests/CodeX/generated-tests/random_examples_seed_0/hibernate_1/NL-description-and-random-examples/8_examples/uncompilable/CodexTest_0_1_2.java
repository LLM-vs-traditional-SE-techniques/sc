import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_1_2 { 
  @Test
    public void testToShort() {
        assertEquals(0, NumberUtils.toShort(Boolean.FALSE));
        assertEquals(1, NumberUtils.toShort(Boolean.TRUE));
        assertEquals(0, NumberUtils.toShort((Object) null));
        assertEquals(0, NumberUtils.toShort(""));
        assertEquals(0, NumberUtils.toShort("0"));
        assertEquals(1, NumberUtils.toShort("1"));
        assertEquals(0, NumberUtils.toShort("-1"));
        assertEquals(0, NumberUtils.toShort("null"));
        assertEquals(0, NumberUtils.toShort("true"));
        assertEquals(0, NumberUtils.toShort("false"));
        assertEquals(0, NumberUtils.toShort("on"));
        assertEquals(0, NumberUtils.toShort("off"));
        assertEquals(0, NumberUtils.toShort("yes"));
        assertEquals(0, NumberUtils.toShort("no"));
        assertEquals(0, NumberUtils.toShort("string"));
        assertEquals(0, NumberUtils.toShort("1.5"));
        assertEquals(0, NumberUtils.toShort("-1.5"));
        assertEquals(0, NumberUtils.toShort("0xFF"));
        assertEquals(0, NumberUtils.toShort("0xFFF"));
        assertEquals(0, NumberUtils.toShort("0xFFFF"));
        assertEquals(0, NumberUtils.toShort("0xFFFFFF"));
        assertEquals(0, NumberUtils.toShort("0xFFFFFFFF"));
        assertEquals(0, NumberUtils.toShort("0xFFFFFFFFF"));
        assertEquals(0, NumberUtils.toShort("0xFFFFFFFFFF"));
        assertEquals(0, NumberUtils.toShort("0xFFFFFFFFFFFF"));
        assertEquals
}