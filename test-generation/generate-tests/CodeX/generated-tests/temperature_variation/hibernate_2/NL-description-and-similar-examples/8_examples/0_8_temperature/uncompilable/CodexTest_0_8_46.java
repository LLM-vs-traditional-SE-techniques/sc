import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_46 { 
  @Test
  public void testFromString() {
    String[] TRUE_STRINGS = {
      "true",
      "T",
      "y",
      "Y",
      "on",
      "ON",
      "1"
    };
    String[] FALSE_STRINGS = {
      "false",
      "f",
      "n",
      "N",
      "off",
      "OFF",
      "0"
    };
    for (String s : TRUE_STRINGS) {
      assertEquals("\"" + s + "\" should be true", Boolean.TRUE, Boolean.fromString(s));
    }
    for (String s : FALSE_STRINGS) {
      assertEquals("\"" + s + "\" should be false", Boolean.FALSE, Boolean.fromString(s));
    }
  }
}