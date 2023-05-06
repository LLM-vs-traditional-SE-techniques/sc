import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_74 { 
  @Test
  public void testToShort() {
		BooleanTypeDescriptor d = new BooleanTypeDescriptor();
		assertEquals((short) 1, d.toShort(Boolean.TRUE));
		assertEquals((short) 0, d.toShort(Boolean.FALSE));
	}
}