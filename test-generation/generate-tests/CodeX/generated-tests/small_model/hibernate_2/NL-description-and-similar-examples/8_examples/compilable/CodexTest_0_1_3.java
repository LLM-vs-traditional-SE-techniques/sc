import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_1_3 { 
  @Test
  public void testFromString() {
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("true", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("false", null));
    assertNull(BooleanTypeDescriptor.INSTANCE.wrap("", null));
    assertNull(BooleanTypeDescriptor.INSTANCE.wrap(null, null));
  }
}