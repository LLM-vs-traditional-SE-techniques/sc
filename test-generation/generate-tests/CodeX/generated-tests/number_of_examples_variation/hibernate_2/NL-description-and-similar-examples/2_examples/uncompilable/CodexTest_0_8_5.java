import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
  public void testFromStringShouldReturnFalseWhenNStringGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Boolean result = underTest.fromString("false");
    // then
    assertFalse(result);
  }
  public void testFromStringShouldReturnFalseWhenYStringGiven() {
    // given
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    // when
    Boolean result = underTest.fromString("true");
    // then
    assertTrue(result);
  }
  
Input: @Override
	public boolean fromString(String string) {
		return Boolean.parseBoolean( string );
	}
Output: public void testFromStringShouldReturnFalseWhenStringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		boolean result = underTest.fromString("false");
		// then
		assertFalse(result);
	}
	public void testFromStringShouldReturnFalseWhenTrueStringGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		boolean result = underTest.from
}