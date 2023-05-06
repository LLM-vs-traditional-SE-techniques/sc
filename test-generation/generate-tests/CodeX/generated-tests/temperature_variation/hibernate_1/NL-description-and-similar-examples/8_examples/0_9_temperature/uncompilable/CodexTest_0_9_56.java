import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_56 { 
  @Test
    public void testToShortShouldThrowIllegalArgumentExceptionWhenNullValueGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        try {
            underTest.toShort(null);
            fail("IllegalArgumentException expected");
        } catch (IllegalArgumentException e) {
            // then
            assertTrue(predicate is OK);
        }
    }
}