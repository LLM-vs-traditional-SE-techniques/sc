import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_3 { 
  @Test
  public void testFromString() {
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("true"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("false"));
    assertNull(BooleanTypeDescriptor.INSTANCE.fromString(""));
    assertNull(BooleanTypeDescriptor.INSTANCE.fromString("foo"));
    assertNull(BooleanTypeDescriptor.INSTANCE.fromString("1"));
    assertNull(BooleanTypeDescriptor.INSTANCE.fromString("0"));
  }
}