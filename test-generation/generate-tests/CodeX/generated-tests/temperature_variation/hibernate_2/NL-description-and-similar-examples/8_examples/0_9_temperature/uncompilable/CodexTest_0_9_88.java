import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_88 { 
    public void testFromStringFalseWhenStringNULL() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString(null);
        // then
        assertEquals(null, result);
    }"
Input: public Boolean fromString(String string) {
		return Boolean.valueOf( string );
	}
Output: @Test
	public void returnsFalseWhenValueFalse() {
		assertValue(false, new Boolean(false));
	}"""
}