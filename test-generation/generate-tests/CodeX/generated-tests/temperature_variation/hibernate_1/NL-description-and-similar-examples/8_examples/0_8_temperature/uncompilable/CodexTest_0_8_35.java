import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_35 { 
  @Test
        public void testToShortShouldReturnZeroWhenFalseGiven() {
            // given
            BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
            // when
            Short result = underTest.toShort(Boolean.FALSE);
            // then
            assertEquals(Short.valueOf(0), result);
        }
        
Input: public  int toInt(Boolean value) {
		return TRUE.equals( value ) ? 1 : 0;
	}
Output:
        public void testToIntShouldReturnZeroWhenFalseGiven() {
            // given
            BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
            // when
            int result = underTest.toInt(Boolean.FALSE);
            // then
            assertEquals(0, result);
        }
}