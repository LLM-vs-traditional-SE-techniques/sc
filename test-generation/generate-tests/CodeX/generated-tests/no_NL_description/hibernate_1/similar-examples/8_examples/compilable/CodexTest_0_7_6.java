import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_6 { 
  @Test
  public void testToShort() {
		BooleanTypeDescriptor descriptor = new BooleanTypeDescriptor();
		assertEquals(Short.valueOf((short) 1), descriptor.toShort(Boolean.TRUE));
		assertEquals(Short.valueOf((short) 0), descriptor.toShort(Boolean.FALSE));
	}
}