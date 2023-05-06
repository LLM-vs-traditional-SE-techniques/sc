import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_6 { 
  @Test
    public void testConvertToShort() {
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        Boolean value = Boolean.FALSE;
        Short result = underTest.toShort(value);
        assertEquals(0, result.shortValue());
    }
}