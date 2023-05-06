import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
  public void testToShort() {
    assertEquals((short) 0, ConverterUtil.convertToShort(Boolean.FALSE));
    assertEquals((short) 1, ConverterUtil.convertToShort(Boolean.TRUE));
    // test with null
    assertNull(ConverterUtil.convertToShort(null));
    // test with non-null object
    Object object = new Object();
    assertEquals((short) 1, ConverterUtil.convertToShort(object));
  }
}