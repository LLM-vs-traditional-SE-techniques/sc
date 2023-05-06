import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
    public void testToShortShouldReturnNonNullWhenNullValueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(null);
        // then
        assertNull(result);
    }
    public void testToShortShouldReturnZeroWhenFalseValueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(false);
        // then
        assertNotNull(result);
        assertEquals(Short.valueOf("0"), result);
        assertEquals(Short.valueOf("0"), result);
    }
    public void testToShortShouldReturnOneWhenTrueValueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(true);
        // then
        assertNotNull(result);
        assertEquals(Short.valueOf("1"), result);
        assertEquals(Short.valueOf("1"), result);
    }
}