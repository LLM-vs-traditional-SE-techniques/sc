import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_7 { 
  @Test
  public void testToIntShouldReturnZeroWhenFalseGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    int result = underTest.toInt(false);
    // then
    assertEquals("Result does not match", 0, result);
  }
}