import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
        @Test
        public void testToShort() {
            assertEquals((short) 1, BooleanUtils.toShort(Boolean.TRUE));
            assertEquals((short) 0, BooleanUtils.toShort(Boolean.FALSE));
            assertEquals((short) 1, BooleanUtils.toShort(Boolean.TRUE, (short) 0, (short) 1));
            assertEquals((short) 0, BooleanUtils.toShort(Boolean.FALSE, (short) 0, (short) 1));
            assertEquals((short) 1, BooleanUtils.toShort(Boolean.TRUE, (short) 1, (short) 0));
            assertEquals((short) 0, BooleanUtils.toShort(Boolean.FALSE, (short) 1, (short) 0));
        }
}