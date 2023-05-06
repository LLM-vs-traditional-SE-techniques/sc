import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_67 { 
  @Test
  public void testIsTrue() {
    assertTrue(isTrue("true"));
    assertTrue(isTrue("TrUE"));
    assertFalse(isTrue("false"));
    assertFalse(isTrue("something else"));
  }
}