import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_3 { 
  @Test
  public void testShortToBoolean() {
		Boolean b = true;
		Short s = TypeConverter.toShort(b);
		assertEquals(s, new Short((short)1));
	}
}