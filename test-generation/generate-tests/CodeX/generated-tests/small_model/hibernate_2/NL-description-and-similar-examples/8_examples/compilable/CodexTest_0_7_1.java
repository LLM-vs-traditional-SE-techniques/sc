import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
    public void testFromStringShouldReturnTrueWhenStringGiven() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("true");
        // then
        assertTrue(result);
    }
    public void testFromStringShouldReturnFalseWhenStringGiven() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("false");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnFalseWhenEmptyStringGiven() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnNullWhenNullStringGiven() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString(null);
        // then
        assertNull(result);
    }
    public void testFromStringShouldReturnNullWhenInvalidStringGiven() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("foo");
        // then
        assertNull(result);
    }
}