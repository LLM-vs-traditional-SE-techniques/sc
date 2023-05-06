import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
    @Test
    public void testToShortShouldReturnOneWhenTrueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(Boolean.TRUE);
        // then
        assertThat(result, equalTo((short) 1));
    }
    @Test
    public void testToShortShouldReturnZeroWhenFalseGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(Boolean.FALSE);
        // then
        assertThat(result, equalTo((short) 0));
    }
    @Test
    public void testToShortShouldReturnNullWhenNullGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(null);
        // then
        assertNull(result);
    }
 */
}