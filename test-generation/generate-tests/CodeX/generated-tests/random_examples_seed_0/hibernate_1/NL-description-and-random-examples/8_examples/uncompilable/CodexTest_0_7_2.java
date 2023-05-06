import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
     public void testShortToBoolean() {
			assertEquals(BooleanUtils.TRUE, BooleanUtils.toBooleanObject((short) 1));
			assertEquals(BooleanUtils.TRUE, BooleanUtils.toBooleanObject((short) 2));
			assertEquals(BooleanUtils.FALSE, BooleanUtils.toBooleanObject((short) 0));
			assertNull(BooleanUtils.toBooleanObject((short) -1));
		}
}