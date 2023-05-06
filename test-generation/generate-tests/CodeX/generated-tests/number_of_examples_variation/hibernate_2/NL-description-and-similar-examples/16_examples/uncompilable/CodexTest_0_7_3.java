import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_3 { 
  @Test
  public void testFromString() {
    BooleanConverter converter = new BooleanConverter();
    assertEquals(Boolean.TRUE, converter.fromString("true"));
    assertEquals(Boolean.FALSE, converter.fromString("false"));
    assertEquals(Boolean.FALSE, converter.fromString(""));
    assertEquals(Boolean.FALSE, converter.fromString(" "));
    assertEquals(Boolean.FALSE, converter.fromString(null));
  }
}