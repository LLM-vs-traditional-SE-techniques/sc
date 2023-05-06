import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  /**
   * This method is called to unwrap the value from string content from the request body.
   */
  public void testWithTrueString() {
    Boolean value = Boolean.TRUE;
    String string = value.toString();
    assertEquals(value, adapter.fromString(string));
  }
}