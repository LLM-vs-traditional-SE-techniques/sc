import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_5 { 
  @Test
    public void testFromStringShouldReturnFalseWhenFStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("F");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnFalseWhenFAStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("FA");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnFalseWhenFalseStringGiven() {
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
        Boolean result = underTest.fromString("N");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnFalseWhenNAStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("NA");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnFalseWhenNoStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("NO");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnTrueWhenTStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("T");
        // then
        assertTrue(result);
    }
    public void testFromStringShouldReturnTrueWhenTAStringGiven() {
        // given
        BooleanTypeDesc
}