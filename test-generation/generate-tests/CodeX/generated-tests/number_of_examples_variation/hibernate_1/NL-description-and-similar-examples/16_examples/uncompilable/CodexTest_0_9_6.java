import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
        @Test
	public void testToShort() {
            Boolean value = true;
            final int expResult = 1;
		final Short result = ShortTypeDescriptor.INSTANCE.toShort(value);
		Assert.assertEquals(expResult, result.intValue());
	}
}