import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
    public void testFromStringShouldReturnFalseWhenFStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("false");
        // then
        assertFalse(result);
    }
    
    public void testFromStringShouldReturnFalseWhenNStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("no");
        // then
        assertFalse(result);
    }
    
    public void testFromStringShouldReturnFalseWhenOStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("off");
        // then
        assertFalse(result);
    }
    
    public void testFromStringShouldReturnFalseWhenTStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("true");
        // then
        assertTrue(result);
    }
    
    public void testFromStringShouldReturnFalseWhenYStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("yes");
        // then
        assertTrue(result);
    }
    
    public void testFromStringShouldReturnFalseWhen1StringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("1");
        // then
        assertTrue(result);
    }
}