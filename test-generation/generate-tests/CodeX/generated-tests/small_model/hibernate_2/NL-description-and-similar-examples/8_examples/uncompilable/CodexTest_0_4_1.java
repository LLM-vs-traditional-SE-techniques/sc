import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_1 { 
  @Test
  public void testFromString() {
    assertTrue(BooleanTypeDescriptor.INSTANCE.wrap("true", null));
    assertFalse(BooleanTypeDescriptor.INSTANCE.wrap("false", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("true", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("false", null), BooleanTypeDescriptor.INSTANCE.wrap("false", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("1", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("t", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("T", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("TRUE", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("True", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("TRUe", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("truE", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor.INSTANCE.wrap("TRUE ", null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.wrap("true", null), BooleanTypeDescriptor
}