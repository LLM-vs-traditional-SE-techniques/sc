import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_42 { 
  @Test
  public void testFromString() {
    for (String string : VALUES) {
      assertEquals(Boolean.valueOf(string), Boolean.valueOf(string));
    }
  }
}