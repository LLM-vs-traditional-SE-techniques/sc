import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_3 { 
  @Test
    public void testToShort() {
		assertEquals(0, TypeConversionUtil.toShort(null));
		assertEquals(1, TypeConversionUtil.toShort(Boolean.FALSE));
		assertEquals(1, TypeConversionUtil.toShort(Boolean.TRUE));
	}
}