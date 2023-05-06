import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_35 { 
  @Test
  public void testtoShortShouldReturnS() {
      //given
      BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
      //when
      Short result = underTest.toShort((Boolean) true);
      //then
      assertEquals(0, result != null ? result : 0);
  }
}