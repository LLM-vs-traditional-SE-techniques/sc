import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
  public void testToShort() {
    assertEquals("Wrong toShort(true)", (short) 1, BooleanTypeDescriptor.INSTANCE.toShort(true));
    assertEquals("Wrong toShort(false)", (short) 0, BooleanTypeDescriptor.INSTANCE.toShort(false));
    assertEquals("Wrong toShort(null)", (short) 0, BooleanTypeDescriptor.INSTANCE.toShort(null));
  }
}