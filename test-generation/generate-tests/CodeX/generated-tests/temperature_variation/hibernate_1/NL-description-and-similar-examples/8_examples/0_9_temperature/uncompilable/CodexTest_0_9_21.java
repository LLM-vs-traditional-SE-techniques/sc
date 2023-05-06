import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_21 { 
  @Test
  public void testToShort() {
      short shortValue = 0;
      BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
      Short result = underTest.toShort(Boolean.TRUE);
      assertEquals((short) 1, result.shortValue());
      result = underTest.toShort(Boolean.FALSE);
      assertEquals(shortValue, result.shortValue());
}