import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_3 { 
  @Test
  public void testToShort() {
		Boolean value = Boolean.TRUE;
		short expected = 1;
		short actual = toShort(value);
		assertEquals(expected, actual);
	}
}