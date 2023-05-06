import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_6 { 
  @Test
  public void testToShort() {
		assertEquals(0, BooleanUtils.toShort(null));
		assertEquals(1, BooleanUtils.toShort(Boolean.TRUE));
		assertEquals(0, BooleanUtils.toShort(Boolean.FALSE));
	}
}