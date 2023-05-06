import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_9 { 
  @Test
  public void testToShort() {
    try {
      assertEquals("The method should return 0", 0, toShort(false));
      assertEquals("The method should return 1", 1, toShort(true));
    } catch (Exception e) {
      fail("The method should not throw an exception");
    }
  }
}