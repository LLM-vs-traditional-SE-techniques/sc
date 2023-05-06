import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_13 { 
  @Test
  public void testToShortWithTrueAsValue() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Short result = underTest.toShort(true);
		// then
		assertEquals(1, (long) result);
	}
  public void testToShortWithFalseAsValue() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Short result = underTest.toShort(false);
		// then
		assertEquals(0, (long) result);
	}
}