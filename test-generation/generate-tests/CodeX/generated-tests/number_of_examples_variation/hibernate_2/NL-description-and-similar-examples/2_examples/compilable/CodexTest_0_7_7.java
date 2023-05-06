import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
  public void testFromStringShouldReturnTrueWhenTStringGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Boolean result = underTest.fromString("true");
    // then
    assertTrue(result);
  }
  public void testFromStringShouldReturnFalseWhenFStringGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Boolean result = underTest.fromString("false");
    // then
    assertFalse(result);
  }
}