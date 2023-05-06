import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_2_5 { 
  @Test
    public void testToShort() {
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        assertEquals(Short.valueOf((short) 1), underTest.toShort(Boolean.TRUE));
        assertEquals(Short.valueOf((short) 0), underTest.toShort(Boolean.FALSE));
    }
}