import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
    public void testToShortShouldReturnOneWhenTrueGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Integer result = underTest.toInt(true);
		// then
		assertEquals(Integer.valueOf(1),result);
	}
}