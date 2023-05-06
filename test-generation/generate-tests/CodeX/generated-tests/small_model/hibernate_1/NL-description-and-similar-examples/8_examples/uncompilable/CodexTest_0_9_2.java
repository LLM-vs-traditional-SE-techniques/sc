import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
    public void testToShort() {
        assertEquals("toShort(true)",	Utils.to_s((short) 1), Utils.to_s(to_short(TRUE)));
        assertEquals("toShort(false)",	Utils.to_s((short) 0), Utils.to_s(to_short(FALSE)));
        assertEquals("toShort(null)",	Utils.to_s((short) 0), Utils.to_s(to_short((Boolean) NULL)));
    }

}