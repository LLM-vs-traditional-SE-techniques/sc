import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_7 { 
  @Test
    public void testToLong() {
		assertEquals((long) 127, (long) PrimitiveConversions.toLong((byte) 127));
		assertEquals((long) 32767, (long) PrimitiveConversions.toLong((short) 32767));
		assertEquals((long) 2147483647, (long) PrimitiveConversions.toLong(Integer.MAX_VALUE));
		assertEquals((long) Long.MAX_VALUE, (long) PrimitiveConversions.toLong(Long.MAX_VALUE));
	}
}