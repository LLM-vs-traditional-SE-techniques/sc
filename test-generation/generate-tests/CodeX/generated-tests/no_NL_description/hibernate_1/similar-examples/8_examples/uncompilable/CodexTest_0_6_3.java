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
    ShortTypeDescriptor descriptor = new ShortTypeDescriptor();
    assertNull(descriptor.toShort(null));
    assertEquals(Short.valueOf((short) 1), descriptor.toShort(Boolean.TRUE));
    assertEquals(Short.valueOf((short) 0), descriptor.toShort(Boolean.FALSE));
  }
}