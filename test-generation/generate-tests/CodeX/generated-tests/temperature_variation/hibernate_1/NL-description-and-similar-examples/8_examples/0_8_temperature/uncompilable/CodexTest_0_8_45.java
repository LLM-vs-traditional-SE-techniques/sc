import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_45 { 
  @Test
    public void testToShortWithTrueValue() {
        // Given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // When
        Short result = underTest.toShort(true);
        // Then
        assertTrue(Short.class.isAssignableFrom(result.getClass()));
        assertEquals(result, 1);
    }
}