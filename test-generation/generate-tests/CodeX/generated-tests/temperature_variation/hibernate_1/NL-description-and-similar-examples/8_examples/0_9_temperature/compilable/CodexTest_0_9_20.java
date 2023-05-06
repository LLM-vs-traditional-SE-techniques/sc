import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_20 { 
  @Test
  public void testToShortShouldReturnNegativeOneWhenFalseGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Short result = underTest.toShort(Boolean.FALSE);
		// then
		assertEquals(Short.valueOf((short) 0), result);
	}
	public void testToShortShouldReturnZeroWhenTrueGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Short result = underTest.toShort(Boolean.TRUE);
		// then
		assertEquals(Short.valueOf((short) 1), result);
	}
}