import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_64 { 
  @Test
    public void testToShortShouldReturnShortTrueWhenBooleanTrueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(TRUE);
        // then
        assertEquals(Short.valueOf((short)1), result);
    }
    public void testToShortShouldReturnShortFalseWhenBooleanFalseGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(FALSE);
        // then
        assertEquals(Short.valueOf((short)0), result);
    }
    public void testToShortShouldReturnNullWhenNullGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(NULL);
        // then
        assertNull(result);
    }
}