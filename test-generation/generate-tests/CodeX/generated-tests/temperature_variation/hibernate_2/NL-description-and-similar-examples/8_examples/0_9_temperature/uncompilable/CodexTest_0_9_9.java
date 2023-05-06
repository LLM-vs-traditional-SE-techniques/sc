import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
  public void testFromString() {
		assertEquals("true", Boolean.TRUE, BooleanType.INSTANCE.fromString("true"));
    assertEquals("false", Boolean.FALSE, BooleanType.INSTANCE.fromString("false"));
    try {
      BooleanType.INSTANCE.fromString("xyz");
      fail("Expecting exception");
    }
    catch (RuntimeException expected) {
      // expected outcome
    }
  }
}