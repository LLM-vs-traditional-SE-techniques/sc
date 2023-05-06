import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_1 { 
  @Test
    public static short booleanToShort(boolean b) {
        return (short) (b ? 1 : 0);
    }
    public void testBooleanToShort() {
        assertEquals(BooleanConversions.booleanToShort(true), (short) 1);
        assertEquals(BooleanConversions.booleanToShort(false), (short) 0);
    }
}