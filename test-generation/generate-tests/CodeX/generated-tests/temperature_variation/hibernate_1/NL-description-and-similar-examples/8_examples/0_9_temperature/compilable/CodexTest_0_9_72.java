import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_72 { 
  @Test
  public void testToShortShouldReturnOneWhenTrueBooleanGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Short result = underTest.toShort(TRUE);
    // then
    assertEquals(Short.valueOf((short) 1), result);
  }
  public void testToShortShouldReturnZeroWhenFalseBooleanGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Short result = underTest.toShort(FALSE);
    // then
    assertEquals(Short.valueOf((short) 0), result);
  }
  public void testToShortShouldReturnNullWhenNullBooleanGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Short result = underTest.toShort(null);
    // then
    assertNull(result);
  }
}