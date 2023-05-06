import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_2 { 
  @Test
  public void testCreateWrappedWithBooleanArgument() {
    BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
    assertEquals(Boolean.TRUE, underTest.wrap(true, null));
    assertEquals(Boolean.FALSE, underTest.wrap(false, null));
    assertEquals(Boolean.TRUE, underTest.wrap(1L, null));
    assertEquals(Boolean.TRUE, underTest.wrap(1, null));
    assertEquals(Boolean.TRUE, underTest.wrap(1.0, null));
    assertEquals(Boolean.TRUE, underTest.wrap(1.001d, null));
    assertEquals(Boolean.TRUE, underTest.wrap(1.001f, null));
    assertEquals(Boolean.TRUE, underTest.wrap(1.001, null));
    assertEquals(Boolean.TRUE, underTest.wrap((byte) 1, null));
    assertEquals(Boolean.TRUE, underTest.wrap((short) 1, null));
    assertEquals(Boolean.TRUE, underTest.wrap((char) 1, null));
    assertEquals(Boolean.TRUE, underTest.wrap((byte) 1, null));
    assertEquals(Boolean.FALSE, underTest.wrap(0L, null));
    assertEquals(Boolean.FALSE, underTest.wrap(0, null));
    assertEquals(Boolean.FALSE, underTest.wrap(0.0, null));
    assertEquals(Boolean.FALSE, underTest.wrap(0.0f, null));
    assertEquals(Boolean.FALSE, underTest.wrap(0.0d, null));
    assertEquals(Boolean.FALSE, underTest.wrap(0.0f, null));
    assertEquals(Boolean.FALSE, underTest.wrap((byte) 0, null));
    assertEquals(Boolean.FALSE, underTest.wrap((short) 0, null));
    assertEquals(Boolean.FALSE, underTest.wrap((short) 0, null));
    assertEquals(Boolean.FALSE, underTest.wrap((char) 0, null));
    assertEquals(Boolean.FALSE, underTest.wrap(0.0f, null));
    assertEquals(Boolean.TRUE, underTest.wrap(new Object(), null));
    assertEquals(Boolean.FALSE, underTest.wrap(null, null));
  }
}
}