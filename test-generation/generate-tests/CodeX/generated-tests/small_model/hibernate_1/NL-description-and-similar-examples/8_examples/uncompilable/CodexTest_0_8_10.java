import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
  @Test
  private static boolean isTrue(Character value) {
    return value == T;
  }
  private static boolean isTrue(String value) {
    return value.compareToIgnoreCase("T") == 0;
  }
  private static boolean isTrue(boolean value) {
    return value;
  }
}