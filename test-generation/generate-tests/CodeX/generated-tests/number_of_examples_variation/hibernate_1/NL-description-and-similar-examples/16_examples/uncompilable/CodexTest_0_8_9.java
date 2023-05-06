import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
    public void testToShortShouldReturnNonNullForTrue() {
        Boolean value = Boolean.TRUE;
        // when
        Short result = underTest.toShort(value);
        // then
        assertNotNull(result);
    }
}