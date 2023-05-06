import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_6 { 
  @Test
    public void testShortValueOf() {
        assertEquals(Short.valueOf((short)1), Short.valueOf(toShort(true)));
        assertEquals(Short.valueOf((short)0), Short.valueOf(toShort(false)));
    }
}