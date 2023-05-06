import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_0_1 { 
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
        assertEquals(0, NumberUtils.toShort("+0"));
        assertEquals(1, NumberUtils.toShort("+1"));
        assertEquals(0, NumberUtils.toShort("false"));
        assertEquals(1, NumberUtils.toShort("true"));
        assertEquals(0, NumberUtils.toShort("FALSE"));
        assertEquals(1, NumberUtils.toShort("TRUE"));
        assertEquals(0, NumberUtils.toShort("False"));
        assertEquals(1, NumberUtils.toShort("True"));
        assertEquals(0, NumberUtils.toShort("no"));
        assertEquals(1, NumberUtils.toShort("yes"));
        assertEquals(0, NumberUtils.toShort("NO"));
        assertEquals(1, NumberUtils.toShort("YES"));
        assertEquals(0, NumberUtils.toShort("No"));
        assertEquals(1, NumberUtils.toShort("Yes"));
        assertEquals(0, NumberUtils.toShort("off"));
        assertEquals(1, NumberUtils.toShort("on"));
        assertEquals(0, NumberUtils.toShort("OFF"));
        assertEquals(1, NumberUtils.toShort("ON"));
        assertEquals(0, NumberUtils.
}