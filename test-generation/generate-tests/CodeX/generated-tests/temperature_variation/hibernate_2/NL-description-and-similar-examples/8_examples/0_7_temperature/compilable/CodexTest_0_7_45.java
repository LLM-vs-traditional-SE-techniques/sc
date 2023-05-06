import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_45 { 
  @Test
  public void testFromString() {
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("false"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("true"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("TRUE"));
  }
}