import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_31 { 
  @Test
  public void testToShortShouldReturnFalseWhenFalseBooleanGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Short result = underTest.toShort(Boolean.FALSE);
    // then
    assertEquals(Short.valueOf((short)0), result);
}
}