import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_36 { 
  @Test
  public void testFromStringShouldReturnTrueGivenB() {
		// given
		CustomBooleanTypeDescriptor underTest = new CustomBooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("true");
		// then
		assertTrue(result);
	}
}