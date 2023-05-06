import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_33 { 
  @Test
  public void testToShortShouldReturnZeroWhenTrueGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Short result = underTest.toShort(Boolean.TRUE);
    // then
    assertEquals(1, result);
  }
Input: public final static int ESSENTIAL = 1;
			public final static int ESSENTIAL_IF_TRUE = 2;
			public final static int ESSENTIAL_IF_FALSE = 3;
			public final static int NON_ESSENTIAL = 4;
Output:
}