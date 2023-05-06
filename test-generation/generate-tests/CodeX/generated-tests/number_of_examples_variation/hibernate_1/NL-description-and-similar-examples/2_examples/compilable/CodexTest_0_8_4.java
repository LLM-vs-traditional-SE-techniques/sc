import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
  public void testToShortShouldThrowIllegalArgumentExceptionWhenNullValueGiven() {
		try {
			// given
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			// when
			underTest.toShort(null);
			// then
			fail("Exception should have been thrown");
		} catch (IllegalArgumentException e) {
			assertEquals("Basic value holder cannot handle null value", e.getMessage());
		}
	}
}