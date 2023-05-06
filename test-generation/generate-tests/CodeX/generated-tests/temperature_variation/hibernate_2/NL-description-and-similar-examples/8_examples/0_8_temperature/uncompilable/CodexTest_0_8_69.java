import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_69 { 
  @Test
    public void testFromStringShouldThrowNullPointerExceptionWhenNullStringGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        try {
            underTest.fromString(null);
            fail("NullPointerException should be thrown");
        } catch (NullPointerException npe) {
            // then
            assertThat(npe.getMessage(), equalTo("The string must not be null"));
        }
    }
}