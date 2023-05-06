import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_62 { 
  @Test
  public void testToShortShouldReturnZeroWhenTrueGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Short result = underTest.toShort(Boolean.TRUE);
    // then
    assertEquals(result, Short.valueOf((short) 1));
  }
}