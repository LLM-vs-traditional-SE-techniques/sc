import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
  public void testNullToShort() {
    ShortTypeDescriptor underTest = new ShortTypeDescriptor();
    Assert.assertNull(underTest.toShort(null));
  }
}