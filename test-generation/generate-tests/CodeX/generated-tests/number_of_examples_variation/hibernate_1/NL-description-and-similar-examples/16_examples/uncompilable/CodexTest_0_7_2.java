import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
    public void testToShort() {
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        assertEquals(1, (short)underTest.toShort(true));
        assertEquals(0, (short)underTest.toShort(false));
    }
}