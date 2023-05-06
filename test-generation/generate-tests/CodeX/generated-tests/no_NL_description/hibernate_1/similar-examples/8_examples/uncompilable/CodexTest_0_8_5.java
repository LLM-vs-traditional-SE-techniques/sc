import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_5 { 
  @Test
    public void testToShortFromBoolean() {
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        assertEquals(Short.valueOf((short) 1), underTest.toShort(true));
    }
}