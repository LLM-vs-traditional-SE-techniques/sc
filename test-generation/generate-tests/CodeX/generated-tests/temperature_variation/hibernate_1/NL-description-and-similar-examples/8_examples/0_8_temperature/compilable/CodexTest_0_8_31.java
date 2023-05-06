import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_31 { 
  @Test
    public void testToShortWhenFalseGiven() {
    	// given
    	BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    	// when
    	Short result = underTest.toShort(false);
    	// then
    	assertEquals((short) 0, result.shortValue());
    }
    public void testToShortWhenTrueGiven() {
    	// given
    	BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    	// when
    	Short result = underTest.toShort(true);
    	// then
    	assertEquals((short) 1, result.shortValue());
    }
    public void testToShortWhenNullGiven() {
    	// given
    	BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    	// when
    	Short result = underTest.toShort(null);
    	// then
    	assertNull(result);
    }
}