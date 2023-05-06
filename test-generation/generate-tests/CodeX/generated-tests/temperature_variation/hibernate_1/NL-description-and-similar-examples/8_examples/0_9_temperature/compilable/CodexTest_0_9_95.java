import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_95 { 
  @Test
  
  public void testToShort() {
    BooleanTypeDescriptor descriptor = new BooleanTypeDescriptor();
    assertNull((Short)descriptor.toShort(null));
    assertEquals(Short.valueOf((short)0), descriptor.toShort(Boolean.FALSE));
    assertEquals(Short.valueOf((short)1), descriptor.toShort(Boolean.TRUE));
  }
  
}