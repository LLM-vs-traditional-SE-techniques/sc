import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
    public void testFromString() {
      BooleanTypeDescriptor typeDescriptor = new BooleanTypeDescriptor();
      assertEquals("Expected boolean value [true]", Boolean.TRUE, typeDescriptor.wrap("true", null));
      assertEquals("Expected boolean value [false]", Boolean.FALSE, typeDescriptor.wrap("false", null));
    }
}