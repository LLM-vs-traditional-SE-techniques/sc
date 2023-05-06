import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_10 { 
  @Test
    public void testToShort() {
        BooleanConverter converter = new BooleanConverter();
        assertEquals("1", (short)1, converter.toShort(Boolean.TRUE));
        assertEquals("0", (short)0, converter.toShort(Boolean.FALSE));
    }
}