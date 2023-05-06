import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
  public void testFromString() {
    assertEquals("true",  Boolean.valueOf( "true" ).toString());
    assertEquals("false", Boolean.valueOf( "false" ).toString());
    try {
      assertEquals(null, Boolean.valueOf( "foo" ));
      fail("Expected IllegalArgumentException");
    } catch (IllegalArgumentException expected) {
      // expected
    }
  }
}