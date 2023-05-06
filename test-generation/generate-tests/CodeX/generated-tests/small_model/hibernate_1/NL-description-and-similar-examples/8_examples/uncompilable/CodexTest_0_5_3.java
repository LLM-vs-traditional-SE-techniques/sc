import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_3 { 
  @Test
  public void testToShortShouldReturnZeroWhenFalseGiven() {
    assertEquals(0, BooleanTypeDescriptor.INSTANCE.wrap(false, null).shortValue());
  }
  public void testToShortShouldReturnOneWhenTrueGiven() {
    assertEquals(1, BooleanTypeDescriptor.INSTANCE.wrap(true, null).shortValue());
  }
}