import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public void testToShortShouldReturnZeroWhenFalseValueGiven() {
    // given
    IntTypeDescriptor underTest = new IntTypeDescriptor();
    // when
    Short result = underTest.toShort(false);
    // then
    assertEquals("false", 0, result);
  }
  public void testToShortShouldReturnOneWhenTrueValueGiven() {
    // given
    IntTypeDescriptor underTest = new IntTypeDescriptor();
    // when
    Short result = underTest.toShort(true);
    // then
    assertEquals("true", 1, result);
  }
}