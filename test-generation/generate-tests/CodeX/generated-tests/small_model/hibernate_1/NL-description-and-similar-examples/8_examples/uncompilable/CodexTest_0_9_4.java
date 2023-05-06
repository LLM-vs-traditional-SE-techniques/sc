import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
  public void testToShortShouldReturnTrueWhenBoolenIsTrue() {
    // given
    BooleanTypeDescriptor wrapper = new BooleanTypeDescriptor();
    // when
    Short result = wrapper.toShort((short) 1);
    // then
    assertThat(result, is(0));
  }
}