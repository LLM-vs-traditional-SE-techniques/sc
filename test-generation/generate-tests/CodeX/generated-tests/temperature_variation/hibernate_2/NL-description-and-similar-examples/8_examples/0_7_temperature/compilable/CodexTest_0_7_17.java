import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_17 { 
  @Test
    public void testFromString() {
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		assertEquals(Boolean.TRUE, underTest.fromString("true"));
		assertEquals(Boolean.FALSE, underTest.fromString("false"));
		assertEquals(Boolean.TRUE, underTest.fromString("TRUE"));
		assertEquals(Boolean.TRUE, underTest.fromString("TRuE"));
		assertEquals(Boolean.FALSE, underTest.fromString("FALSE"));
		assertEquals(Boolean.FALSE, underTest.fromString("FAlSE"));
		assertNull(underTest.fromString("foo"));
	}
}