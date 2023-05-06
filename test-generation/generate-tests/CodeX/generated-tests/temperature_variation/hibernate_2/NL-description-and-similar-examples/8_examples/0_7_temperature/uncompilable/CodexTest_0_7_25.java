import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_25 { 
  @Test
  public void testFromString() {
		assertTrue(Boolean.TRUE.equals(BOOLEAN.fromString("true")));
		assertTrue(Boolean.TRUE.equals(BOOLEAN.fromString("TRUE")));
		assertTrue(Boolean.TRUE.equals(BOOLEAN.fromString("t")));
		assertTrue(Boolean.TRUE.equals(BOOLEAN.fromString("T")));
		assertTrue(Boolean.FALSE.equals(BOOLEAN.fromString("false")));
		assertTrue(Boolean.FALSE.equals(BOOLEAN.fromString("FALSE")));
		assertTrue(Boolean.FALSE.equals(BOOLEAN.fromString("f")));
		assertTrue(Boolean.FALSE.equals(BOOLEAN.fromString("F")));
		assertTrue(Boolean.FALSE.equals(BOOLEAN.fromString("")));
		assertTrue(Boolean.FALSE.equals(BOOLEAN.fromString("wat")));
		assertNull(BOOLEAN.fromString(null));
	}
}