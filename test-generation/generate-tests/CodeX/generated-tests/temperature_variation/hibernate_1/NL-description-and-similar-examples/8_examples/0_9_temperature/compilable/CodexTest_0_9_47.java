import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_47 { 
  @Test
   public static void testToShort() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        Assert.assertEquals(Short.valueOf((short)1), underTest.toShort(Boolean.TRUE));
        Assert.assertNull(underTest.toShort(null));
    }

}