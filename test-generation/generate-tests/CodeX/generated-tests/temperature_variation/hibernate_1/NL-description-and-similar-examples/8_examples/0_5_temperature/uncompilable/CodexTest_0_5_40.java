import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_40 { 
  @Test
    public void testToShortShouldThrowExceptionWhenNullGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        try {
            // when
            underTest.toShort(null);
            fail("Exception expected");
        } catch (HibernateException e) {
            // then
            assertTrue("Exception is not about null conversion",
                    e.getMessage().contains("null"));
        }
    }
}