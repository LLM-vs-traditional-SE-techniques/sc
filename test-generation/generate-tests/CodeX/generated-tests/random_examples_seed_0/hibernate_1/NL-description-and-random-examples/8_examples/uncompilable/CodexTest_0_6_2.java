import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_2 { 
  @Test
     public void testToShort() {
        TestUtil.assertEquals(new Short((short) 1), BooleanUtils.toShort(Boolean.TRUE));
        TestUtil.assertEquals(new Short((short) 0), BooleanUtils.toShort(Boolean.FALSE));
        TestUtil.assertEquals(null, BooleanUtils.toShort(null));
    }
}