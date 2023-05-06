import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_3 { 
  @Test
  public void testFromStringShouldReturnTrueWhenTrueStringGiven() {
    // given
    BooleanType type = new BooleanType();
    // when
    Boolean result = type.fromString("TRUE");
    // then
    assertTrue(result);
  }
}