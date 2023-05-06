import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_91 { 
  @Test
  maybe class name?
  public void testToShort() {
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    Short result = underTest.toShort(true);
    assertEquals(Short.valueOf((short)1), result);
  }
}