import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_5 { 
  @Test
    public void testToShort() {
        assertEquals(0, NumberUtils.toShort(Boolean.FALSE));
        assertEquals(1, NumberUtils.toShort(Boolean.TRUE));
        assertEquals(0, NumberUtils.toShort((Object) null));
        assertEquals(0, NumberUtils.toShort(""));
        assertEquals(0, NumberUtils.toShort(" "));
        assertEquals(0, NumberUtils.toShort("0"));
        assertEquals(1, NumberUtils.toShort("1"));
        assertEquals(0, NumberUtils.toShort("0.0"));
        assertEquals(1, NumberUtils.toShort("1.0"));
        assertEquals(0, NumberUtils.toShort("0.0d"));
        assertEquals(1, NumberUtils.toShort("1.0d"));
        assertEquals(0, NumberUtils.toShort("0.0f"));
        assertEquals(1, NumberUtils.toShort("1.0f"));
        assertEquals(0, NumberUtils.toShort("0.0D"));
        assertEquals(1, NumberUtils.toShort("1.0D"));
        assertEquals(0, NumberUtils.toShort("0.0F"));
        assertEquals(1, NumberUtils.toShort("1.0F"));
        assertEquals(0, NumberUtils.toShort("0.0l"));
        assertEquals(1, NumberUtils.toShort("1.0l"));
        assertEquals(0, NumberUtils.toShort("0.0L"));
        assertEquals(1, NumberUtils.toShort("1.0L"));
        assertEquals(0, NumberUtils.toShort("0.0e1"));
        assertEquals(1, NumberUtils.toShort("1.0e1"));
        assertEquals(0, NumberUtils.toShort("0.0E1"));
        assert
}