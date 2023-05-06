import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_33 { 
  @Test
    public void testToShort() {
        assertNull(toShort(null));
        assertEquals(Short.valueOf((short) 0), toShort(FALSE));
        assertEquals(Short.valueOf((short) 1), toShort(TRUE));
    }
}