import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_16 { 
  @Test
  public void testFromStringShouldReturnTrueWhenFStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("false");
        // then
        assertFalse(result);
    }
Input: public Boolean fromString(String string) {
		return Boolean.valueOf( string );
	}
Output: public void testFromStringShouldReturnTrueWhenTStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("true");
        // then
        assertTrue(result);
    }
Input: public Boolean fromString(String string) {
		return Boolean.valueOf( string );
	}
Output: public void testFromStringShouldReturnFalseWhenEmptyStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("");
        // then
        assertFalse(result);
    }
Input: public Boolean fromString(String string) {
		return Boolean.valueOf( string );
	}
Output: public void testFromStringShouldReturnFalseWhenNullStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("null");
        // then
        assertFalse(result);
    }
}