import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_90 { 
  @Test
  public void testToShortNull() {
    assertNull(Objects.toShort(null));
  }
  public void testToShortFalse() {
    assertEquals(0, Objects.toShort(false));
  }
  public void testToShortTrue() {
    assertEquals(1, Objects.toShort(true));
  }
}