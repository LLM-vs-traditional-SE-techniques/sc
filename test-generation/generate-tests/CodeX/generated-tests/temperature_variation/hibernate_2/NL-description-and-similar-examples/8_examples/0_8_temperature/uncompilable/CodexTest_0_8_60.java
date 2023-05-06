import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_60 { 
  @Test
  public void testFromString() {
		final TypeDescriptor<Boolean> typeDescriptor = new BooleanTypeDescriptor();
		assertEquals(Boolean.TRUE, typeDescriptor.fromString("true"));
		assertEquals(Boolean.FALSE, typeDescriptor.fromString("false"));
		assertEquals(Boolean.TRUE, typeDescriptor.fromString("True"));
		assertEquals(Boolean.FALSE, typeDescriptor.fromString("fAlSe"));
		assertEquals(Boolean.TRUE, typeDescriptor.fromString("1"));
		assertEquals(Boolean.FALSE, typeDescriptor.fromString("0"));
		assertEquals(Boolean.TRUE, typeDescriptor.fromString("on"));
		assertEquals(Boolean.FALSE, typeDescriptor.fromString("off"));
		assertEquals(Boolean.TRUE, typeDescriptor.fromString("yes"));
		assertEquals(Boolean.FALSE, typeDescriptor.fromString("no"));
	}
}