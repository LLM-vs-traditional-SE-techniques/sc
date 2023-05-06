import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
    
    public void testFromStringShouldReturnFalseWhen0StringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("0");
		// then
		assertFalse(result);
	}
    public void testFromStringShouldReturnFalseWhenNStringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("N");
		// then
		assertFalse(result);
	}
    public void testFromStringShouldReturnFalseWhenOffStringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("off");
		// then
		assertFalse(result);
	}
    public void testFromStringShouldReturnFalseWhenFalseStringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("false");
		// then
		assertFalse(
}