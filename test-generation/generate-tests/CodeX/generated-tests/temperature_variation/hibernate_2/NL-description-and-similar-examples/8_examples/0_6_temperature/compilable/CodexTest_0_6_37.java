import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_37 { 
  @Test
  public void testFromStringShouldReturnTrueWhenStringWithTrueIsGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    String string = "true";
    // when
    Boolean result = underTest.fromString(string);
    // then
    assertTrue(result);
    assertEquals(Boolean.TRUE, result);
  }
}