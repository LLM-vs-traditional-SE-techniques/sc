import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
  public void testFromStingNull() {
		try {
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			underTest.fromString(null);
			fail("Should fail to convert null to boolean.");
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
		}
	}
}