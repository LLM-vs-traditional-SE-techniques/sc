import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_13 { 
  @Test
  public void testToShortWhenTrueGiven() {
    Short result = underTest.toShort(true);
    assertEquals(1, result.shortValue());
  }
}