import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_13 { 
  @Test
  /**
   * Suggest a test for a method with the Short toShort(Boolean value) signature.
   */
  public void testToShortShouldReturnShortWhenBooleanGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Short result = underTest.toShort(true);
    // then
    assertEquals(Short.valueOf((short)1), result);
  }
}