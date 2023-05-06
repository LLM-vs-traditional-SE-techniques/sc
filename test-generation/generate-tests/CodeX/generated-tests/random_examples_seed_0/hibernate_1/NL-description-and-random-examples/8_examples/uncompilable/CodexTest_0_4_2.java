import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_2 { 
  @Test
    public void testToShort() {
        assertEquals("0", "0", NumberUtils.toShort("0"));
        assertEquals("1", "1", NumberUtils.toShort("1"));
        assertEquals("1", "1", NumberUtils.toShort("1.5"));
        assertEquals("2", "2", NumberUtils.toShort("2"));
        assertEquals("2", "2", NumberUtils.toShort("2.5"));
        assertEquals("-1", "-1", NumberUtils.toShort("-1"));
        assertEquals("-1", "-1", NumberUtils.toShort("-1.5"));
        assertEquals("-2", "-2", NumberUtils.toShort("-2"));
        assertEquals("-2", "-2", NumberUtils.toShort("-2.5"));
        assertEquals("3", "3", NumberUtils.toShort("3"));
        assertEquals("3", "3", NumberUtils.toShort("3.0"));
        assertEquals("300", "300", NumberUtils.toShort("300"));
        assertEquals("300", "300", NumberUtils.toShort("300.0"));
        assertEquals("12345", "12345", NumberUtils.toShort("12345"));
        assertEquals("12345", "12345", NumberUtils.toShort("12345.0"));
        assertEquals("2147483647", "32767", NumberUtils.toShort("2147483647"));
        assertEquals("2147483648", "32767", NumberUtils.toShort("2147483648"));
        assertEquals("2147483649", "32767", NumberUtils.toShort("2147483649"));
        assertEquals("-2147483648", "-32768", NumberUtils.toShort("-2147483648"));
        assertEquals("-2147483649", "-32768", NumberUtils.toShort("-2147
}