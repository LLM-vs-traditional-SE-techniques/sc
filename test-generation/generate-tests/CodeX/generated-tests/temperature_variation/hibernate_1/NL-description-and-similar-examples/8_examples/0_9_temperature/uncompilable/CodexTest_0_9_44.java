import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_44 { 
    private final Short aNull = null;
    private final Short aZero = (short) 0;
    private final Short aMinusOne = (short) -1;
    private final Short aMaxValue = Short.MAX_VALUE;
    private final Short aMinusMaxValue = Short.MIN_VALUE;
    private final Short aRandomLessThanMaxValue = (short) (Math.random() <= (Math.abs(Short.MAX_VALUE) + 1)) ? Math.round((short)(Math.random() * (Math.abs(Short.MAX_VALUE)))) : Short.MAX_VALUE;
		private final Short aRandomLargerThanMinValue = (short) (Math.random() >= Math.abs(Short.MIN_VALUE)) ? -1 * (short) Math.round((short) (Math.random() * Math.abs(Short.MIN_VALUE))) : Short.MIN_VALUE;
    private final Boolean aNullBoolean = null;
    private final Boolean aTrue = true;
    private final Boolean aFalse = false;
    @Test
		public void aToShortShouldReturnNullWhenNullGiven() {
			// given
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			// when
			Short result = underTest.toShort(null);
			// then
		}
}