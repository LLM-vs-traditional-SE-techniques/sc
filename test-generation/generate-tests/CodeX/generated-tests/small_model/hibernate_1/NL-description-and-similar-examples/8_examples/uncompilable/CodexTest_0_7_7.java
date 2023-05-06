import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
  public void testToShortWithTrue() {
    // given
    BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
    // when
    short result = underlying.toShort(true);
    // then
    assertEquals(1, result);
  }
  public void testToShortWithFalse() {
    // given
    BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
    // when
    short result = underlying.toShort(false);
    // then
    assertEquals(0, result);
  }
  public void testToShortWithNull() {
    // given
    BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
    // when
    short result = underlying.toShort(null);
    // then
    assertEquals(0, result);
  }
  
Input: public Short toShort(Boolean value) {
		return (short) toInt( value );
	}
Output: public void testToShortWithTrue() {
        // given
        BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
        // when
        short result = underlying.toShort(true);
        // then
        assertEquals(1, result);
    }
    public void testToShortWithFalse() {
        // given
        BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
        // when
        short result = underlying.toShort(false);
        // then
        assertEquals(0, result);
    }
    public void testToShortWithNull() {
        // given
        BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
        // when
        short result = underlying.toShort(null);
        // then
        assertEquals(0, result);
    }
    
Input: public Short toShort(Boolean value) {
		return (short) toInt( value );
	}
Output: public void testToShortWithTrue() {
		// given
		BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
		// when
		short result = underlying.toShort(true);
		// then
		assertEquals(1, result);
	}
	public void testToShortWithFalse() {
		// given
		BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
		// when
		short result = underlying.toShort(false);
		// then
		assertEquals(0, result);
	}
	public void testToShortWithNull() {
		// given
		BooleanTypeDescriptor underlying = new BooleanTypeDescriptor();
		// when
		short result = underlying.toShort(null);
		// then
		assertEquals(0,
}