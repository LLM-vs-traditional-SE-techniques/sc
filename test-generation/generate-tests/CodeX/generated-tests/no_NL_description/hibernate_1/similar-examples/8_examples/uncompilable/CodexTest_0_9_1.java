import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_1 { 
  @Test
  public static void testForSimpleClass() {
      String shortcutName = "<lamba>";
      String className = shortcutName + "$1";
      String canonicalName = className;
      assertEquals(canonicalName, TypeUtils.getCanonicalName(shortcutName, java.util.function.LongFunction.class));
    }
}