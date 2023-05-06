import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
    public void testFromString() {
      BooleanTypeDescriptor type = new BooleanTypeDescriptor();
      assertTrue(type.fromString("true"));
      assertTrue(type.fromString("TRUE"));
      assertTrue(type.fromString("True"));
      assertTrue(type.fromString("true "));
      assertTrue(type.fromString("true\n"));
      assertTrue(type.fromString("true\t"));
      assertFalse(type.fromString("false"));
      assertFalse(type.fromString("FALSE"));
      assertFalse(type.fromString("False"));
      assertNull(type.fromString("oops"));
      assertNull(type.fromString(""));
      assertNull(type.fromString(" "));
      assertNull(type.fromString("x"));
    }
}