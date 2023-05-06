import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
    public void testToShortNull() {
    	// given
    	BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    	// when
    	Short result = underTest.toShort(null);
    	// then
    	assertNull(result);
    }
	
	public void testToShortFalse() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Short result = underTest.toShort(false);
		// then
		assertEquals((short) 0, result.shortValue());
	}
	
	public void testToShortTrue() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Short result = underTest.toShort(true);
		// then
		assertEquals((short) 1, result.shortValue());
	}
	
Input: public static int getRawBits(double value) {
		if (!Double.isFinite( value )) {
			return 0x7ff8000000000000L;
		}
		long bits = Double.doubleToLongBits( value );
		return (int) ( ( ( ( ( bits >> 52 ) & 0x7ffL ) - 1023L ) & 0xffff ) | ( ( bits & 0xfffffffffffffL ) << 11 ) );
	}
Output: public void testGetRawBits() {
		assertEquals(0x00000000, DoubleUtils.getRawBits(0.0));
		assertEquals(0x7ff00000, DoubleUtils.getRawBits(Double.POSITIVE_INFINITY));
		assertEquals(0xfff00000, DoubleUtils.getRawBits(Double.NEGATIVE_INFINITY));
		// Test 1.0
		assertEquals(0x3ff00000, DoubleUtils.getRawBits(1.0));
		// Test -1.0
		assertEquals(0xbff00000, DoubleUt
}