import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_64 { 
  @Test
  public void testFromStringBooleanTrue() {
    final BooleanTypeDescriptor testSubject = new BooleanTypeDescriptor();
    final Boolean result = testSubject.fromString("true");
    assertTrue(result);
  }
  public void testFromStringBooleanFalse() {
    final BooleanTypeDescriptor testSubject = new BooleanTypeDescriptor();
    final Boolean result = testSubject.fromString("false");
    assertFalse(result);
  }
}