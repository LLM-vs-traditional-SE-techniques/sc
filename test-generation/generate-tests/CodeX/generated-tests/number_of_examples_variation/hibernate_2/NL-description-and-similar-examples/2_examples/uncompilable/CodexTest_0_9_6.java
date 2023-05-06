import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
    @Test
    public void testFromStringShouldReturnTrueForString1() {
        // given
        BooleanTypeDescriptor typeDescriptor = new BooleanTypeDescriptor();
        String s = "1";
        // when
        Boolean result = typeDescriptor.fromString(s);
        // then
        assertTrue(result);
    }
    @Test
    public void testFromStringShouldReturnFalseForString0() {
        // given
        BooleanTypeDescriptor typeDescriptor = new BooleanTypeDescriptor();
        String s = "0";
        // when
        Boolean result = typeDescriptor.fromString(s);
        // then
        assertFalse(result);
    }
    @Test
    public void testFromStringShouldReturnTrueForStringTrue() {
        // given
        BooleanTypeDescriptor typeDescriptor = new BooleanTypeDescriptor();
        String s = "true";
        // when
        Boolean result = typeDescriptor.fromString(s);
        // then
        assertTrue(result);
    }
    @Test
    public void testFromStringShouldReturnFalseWhenAnyStringWithoutUsing() {
        // given
        BooleanTypeDescriptor typeDescriptor = new BooleanTypeDescriptor();
        String s = "asd
}