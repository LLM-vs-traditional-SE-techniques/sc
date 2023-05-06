import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_10 { 
  @Test
  public void testFromString() {
    assertEquals("Should be true", Boolean.TRUE, Boolean.fromString("true"));
    assertEquals("Should be false", Boolean.FALSE, Boolean.fromString("false"));
    assertNull("Should be null", Boolean.fromString(null));
    assertNull("Should be null", Boolean.fromString(""));
  }
}