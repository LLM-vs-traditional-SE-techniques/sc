import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_22 { 
  @Test
      public void testToShortWithFalse() {
		ShortTypeDescriptor underTest = new ShortTypeDescriptor();
		Short result = underTest.toShort(Boolean.FALSE);
		assertEquals(Short.valueOf((short) 0), result);
	}
}