import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_85 { 
  @Test
      public void testToShortShouldReturnZeroWhenFalseGiven() {
          // given
          BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
       // when
          Short result = underTest.toShort(false);
          // then
          assertEquals(0, result.intValue());
      }
Random Input: public final boolean isGreaterThan(double value) {
		return value < getValue();
	}
Random Output: public void testIsGreaterThan() {
		AlgReal ar = new AlgReal(0.0);
		assertTrue(ar.isGreaterThan(-1.0));
		
	}
}