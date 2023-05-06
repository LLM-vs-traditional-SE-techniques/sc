import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
    public void testToBoolWhenNullGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        Boolean x = null;
        // when
        Boolean result = underTest.toBoolean((Boolean) x);
        // then
        assertEquals(result, null);
    }
	
    public void testToBooleanWhenFalseGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        Boolean x = false;
        // when
        Boolean result = underTest.toBoolean((Boolean) x);
        // then
        assertEquals(false, result);
    }
}