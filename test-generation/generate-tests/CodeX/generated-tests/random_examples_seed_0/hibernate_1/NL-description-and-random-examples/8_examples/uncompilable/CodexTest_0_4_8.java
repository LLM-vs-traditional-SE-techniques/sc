import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_8 { 
  @Test
    public void testToShort() {
		assertEquals(0, Short.valueOf(BooleanUtils.toShort(null)).shortValue());
		assertEquals(1, Short.valueOf(BooleanUtils.toShort(Boolean.TRUE)).shortValue());
		assertEquals(0, Short.valueOf(BooleanUtils.toShort(Boolean.FALSE)).shortValue());
	}
}