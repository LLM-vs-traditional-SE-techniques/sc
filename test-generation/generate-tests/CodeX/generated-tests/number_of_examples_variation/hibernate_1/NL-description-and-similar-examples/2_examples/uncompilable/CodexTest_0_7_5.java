import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_5 { 
  @Test
    
Input: public short toShort(Boolean value) {
        if ( value == null ) {
            throw new HibernateException( "Could not convert to short: null" );
        }
        if ( value ) {
            return (short) 1;
        }
        else {
            return (short) 0;
        }
    }
Output: public void testToShortShouldReturnZeroWhenFalseGiven() {
        // given
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        // when
        Short result = underTest.toShort(false);
        // then
        assertEquals(0, result.shortValue());
    }
}