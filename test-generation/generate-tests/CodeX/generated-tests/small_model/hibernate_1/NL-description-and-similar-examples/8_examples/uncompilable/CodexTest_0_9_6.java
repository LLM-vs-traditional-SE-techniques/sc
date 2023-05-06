import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_6 { 
  @Test
  public void testToLong() {
    BooleanTypeDescriptor descriptor = new BooleanTypeDescriptor();
    Short result = descriptor.toObject(true);
    assertEquals(new Short((short) 1), result);
    result = descriptor.toObject(Boolean.FALSE);
    assertEquals(new Short((short) 0), result);
  }
}