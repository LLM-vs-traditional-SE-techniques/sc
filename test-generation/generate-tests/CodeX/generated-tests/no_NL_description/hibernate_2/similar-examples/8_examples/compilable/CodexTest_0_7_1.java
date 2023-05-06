import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
  public void testFromString() {
    final BooleanTypeDescriptor typeDescriptor = new BooleanTypeDescriptor();
    assertEquals(Boolean.FALSE, typeDescriptor.fromString("false"));
    assertEquals(Boolean.TRUE, typeDescriptor.fromString("true"));
    assertEquals(Boolean.FALSE, typeDescriptor.fromString("f"));
    assertEquals(Boolean.TRUE, typeDescriptor.fromString("t"));
  }
}