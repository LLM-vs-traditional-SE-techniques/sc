import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_7 { 
  @Test
  public void testToShort() {
    assertEquals(0, (short) TypeTransformer.toShort(false));
    assertEquals(1, (short) TypeTransformer.toShort(true));
  }
}