import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
        public void testToIntShouldReturnZeroWhenFalseGiven() {
			// given
			int expected = 0;
			WrapperOptions options = new WrapperOptions();
			// when
			int result = new BooleanTypeDescriptor().wrap(FALSE, options).intValue();
			// then
			assertEquals(expected, result);
		  }
}