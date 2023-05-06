import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_49 { 
    @Test
    public void convertNonNullValueToShort() {
        //given
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        //when
        Short result = underTest.toShort(Boolean.TRUE);
        //then
        assertEquals(Short.valueOf((short) 1), result);
    }
}