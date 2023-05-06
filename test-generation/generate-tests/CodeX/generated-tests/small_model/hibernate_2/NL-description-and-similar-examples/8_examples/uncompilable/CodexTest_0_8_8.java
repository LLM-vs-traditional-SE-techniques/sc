import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
  public void testBooleanFromStringShouldReturnTrueForTrue() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Boolean result = underTest.fromString(Impl.TRUE_STRING);
    // then
    assertTrue(result);
  }
  public void testBooleanFromStringShouldReturnFalseForFalse() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Boolean result = underTest.fromString(Impl.FALSE_STRING);
    // then
    assertFalse(result);
  }
}