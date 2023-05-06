import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_36 { 
  @Test
          public void testToShortShouldReturn1WhenTrueGiven() {
		  // given
		  BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		  // when
		  Short result = underTest.toShort(TRUE);
		  // then
		  assertEquals(Short.valueOf((short) 1), result);
	  }

}