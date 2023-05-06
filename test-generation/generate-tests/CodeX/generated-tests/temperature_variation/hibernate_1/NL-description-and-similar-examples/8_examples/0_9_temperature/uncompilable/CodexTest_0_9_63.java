import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_63 { 
  @Test
  public void testToShortBoolean() {
    short shortExpected = 63647; // > 10 but < 10
    ShortTypeDescriptor underTest = new ShortTypeDescriptor();
    Short shortActual = underTest.toShort(true);
    assertTrue(shortExpected == shortActual);
  }
}