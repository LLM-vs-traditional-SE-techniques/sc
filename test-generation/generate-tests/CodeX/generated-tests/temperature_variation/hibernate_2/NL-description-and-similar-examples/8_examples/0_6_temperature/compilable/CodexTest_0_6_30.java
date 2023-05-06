import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_30 { 
  @Test
  public void testFromString() {
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		assertNull(underTest.fromString(null));
		assertTrue(underTest.fromString("true"));
		assertFalse(underTest.fromString("false"));
		try {
			underTest.fromString("not a boolean");
			fail("Expected exception");
		} catch (Exception e) {
			// expected
		}
	}
}