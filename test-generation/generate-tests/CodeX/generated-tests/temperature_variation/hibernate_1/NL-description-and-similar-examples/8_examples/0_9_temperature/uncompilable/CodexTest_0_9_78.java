import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_78 { 
  @Test
    public void testToShort() {
      assertEquals(0, (short)t.toShort(false));
      assertEquals(1, (short)t.toShort(true));
      assertNull(t.toShort(null));
    }

}