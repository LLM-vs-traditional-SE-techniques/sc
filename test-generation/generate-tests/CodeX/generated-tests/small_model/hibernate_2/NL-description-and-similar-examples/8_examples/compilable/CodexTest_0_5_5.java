import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_5 { 
  @Test
  public void testBooleanFromString() {
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("false", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("true", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("FALSE", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("TRUE", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("0", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("1", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("   ", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("  \t\t", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("  \t\t  \t\t  \t\t", null));
  }
}