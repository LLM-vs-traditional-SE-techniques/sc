import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_40 { 
  @Test
    public void testShortToShort() {
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        assertEquals(Short.valueOf((short)0), underTest.toShort(Boolean.FALSE));
    }
}