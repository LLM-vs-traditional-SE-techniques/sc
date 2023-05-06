import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_3 { 
  @Test
    public void testToShort() {
		assertEquals(0, new Short(BooleanUtils.toShort(null)).shortValue());
		assertEquals(1, new Short(BooleanUtils.toShort(Boolean.TRUE)).shortValue());
		assertEquals(0, new Short(BooleanUtils.toShort(Boolean.FALSE)).shortValue());
	}
}