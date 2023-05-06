import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
  public void testToShortShouldReturnZeroWhenTrue() {
    assertEquals("Wrong result", 0, toShort(true));
  }
  public void testToShortShouldReturnOneWhenFalse() {
    assertEquals("Wrong result", 1, toShort(false));
  }
}