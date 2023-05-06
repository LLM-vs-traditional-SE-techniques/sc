import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_26 { 
  @Test
      Boolean b1 = Boolean.TRUE;
      assertEquals((short) 1, new BooleanTypeDescriptor().toShort(b1));
      Boolean b2 = Boolean.FALSE;
      assertEquals((short) 0, new BooleanTypeDescriptor().toShort(b2));
}