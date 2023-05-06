import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_38 { 
  @Test
    public void testToShort() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Short result = underTest.toShort(Boolean.FALSE);
		// then
		assertEquals(0, (int)result);
	}
}