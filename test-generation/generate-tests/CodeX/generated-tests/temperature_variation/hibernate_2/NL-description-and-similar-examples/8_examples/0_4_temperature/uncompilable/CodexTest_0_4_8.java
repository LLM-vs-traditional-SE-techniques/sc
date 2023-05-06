import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_8 { 
  @Test
    public void testFromStringShouldReturnFalseWhenFStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("false");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnTrueWhenTStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("true");
        // then
        assertTrue(result);
    }
    public void testFromStringShouldReturnFalseWhenFalseStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("False");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnTrueWhenTrueStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("True");
        // then
        assertTrue(result);
    }
    public void testFromStringShouldReturnFalseWhenFStringGiven1() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("f");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnTrueWhenTStringGiven1() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("t");
        // then
        assertTrue(result);
    }
    public void testFromStringShouldReturnFalseWhenFStringGiven2() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Boolean result = underTest.fromString("F");
        // then
        assertFalse(result);
    }
    public void testFromStringShouldReturnTrueWhenTStringGiven2() {
        // given

}