import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_15 { 
  @Test
  public void testFromString() {
  	assertNull(BooleanTypeDescriptor.INSTANCE.fromString(null));
  	assertEquals(TRUE, BooleanTypeDescriptor.INSTANCE.fromString("True"));
  	assertEquals(FALSE, BooleanTypeDescriptor.INSTANCE.fromString("fAlSe"));
    try {
      BooleanTypeDescriptor.INSTANCE.fromString("No");
      fail("Expected a NumberFormatException");
    } catch (NumberFormatException nfe) {
    }
  }
}