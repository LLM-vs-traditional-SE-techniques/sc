import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_10 { 
  @Test
    public void testToShort() {
        assertEquals(0, NumberUtils.toShort(Boolean.FALSE));
        assertEquals(1, NumberUtils.toShort(Boolean.TRUE));
        assertEquals(3, NumberUtils.toShort(new Character((char) 3)));
        assertEquals(2, NumberUtils.toShort(new Byte((byte) 2)));
        assertEquals(12345, NumberUtils.toShort(new Short((short) 12345)));
        assertEquals(123456789, NumberUtils.toShort(new Integer(123456789)));
        assertEquals(-123456789, NumberUtils.toShort(new Long(-123456789)));
        assertEquals(12345, NumberUtils.toShort(new Float(12345.0f)));
        assertEquals(12345, NumberUtils.toShort(new Double(12345.0)));
        assertEquals(12345, NumberUtils.toShort(new BigInteger("12345")));
        assertEquals(-12345, NumberUtils.toShort(new BigDecimal("-12345.0")));
        assertEquals(12345, NumberUtils.toShort("12345"));
        assertEquals(-12345, NumberUtils.toShort("-12345"));
        assertEquals(0, NumberUtils.toShort("0"));
        try {
            NumberUtils.toShort("9.0");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        try {
            NumberUtils.toShort("");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        try {
            NumberUtils.toShort("0.0");
            fail("Should throw NumberFormatException");
        } catch (NumberFormatException e) {
            // Expected
        }
        try {
            NumberUtils.toShort("-123.456");
            fail("Should throw NumberFormatException");
}