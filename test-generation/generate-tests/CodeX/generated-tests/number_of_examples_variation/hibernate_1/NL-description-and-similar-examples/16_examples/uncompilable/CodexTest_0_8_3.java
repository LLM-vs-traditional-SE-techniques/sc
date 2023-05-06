import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_3 { 
  @Test
  public void testToShort() {
	assertEquals("toShort should return 1", TRUE.shortValue(), testNumberInstance.toShort(TRUE));
	assertEquals("toShort should return 0", FALSE.shortValue(), testNumberInstance.toShort(FALSE));
	assertEquals("toShort should return 0", 0, testNumberInstance.toShort(null));
  }
}