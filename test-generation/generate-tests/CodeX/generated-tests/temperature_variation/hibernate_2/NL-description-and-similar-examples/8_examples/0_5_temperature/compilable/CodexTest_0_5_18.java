import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_18 { 
  @Test
  public void testFromString() {
    String trueString = "true";
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Boolean result = underTest.fromString(trueString);
    // then
    assertTrue(result);
  }
}