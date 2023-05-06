import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_4 { 
  @Test
    public void testBooleanToShort() {
        assertEquals(0, Short.valueOf(BooleanUtils.toShortObject(false)).shortValue());
        assertEquals(1, Short.valueOf(BooleanUtils.toShortObject(true)).shortValue());
        assertNull(BooleanUtils.toShortObject(null));
    }

}