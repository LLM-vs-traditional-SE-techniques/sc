import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_53 { 
  @Test
  public void testToShort() {
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    assertEquals(0, underTest.toShort(Boolean.FALSE).intValue());
    assertEquals(1, underTest.toShort(Boolean.TRUE).intValue());
  }
}