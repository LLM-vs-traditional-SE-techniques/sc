import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
  public void testFromString() {
    // given
    BooleanTypeDescriptor sut = new BooleanTypeDescriptor();
    // when
    Boolean result = sut.fromString("true");
    // then
    Assert.assertTrue(result);
  }
}