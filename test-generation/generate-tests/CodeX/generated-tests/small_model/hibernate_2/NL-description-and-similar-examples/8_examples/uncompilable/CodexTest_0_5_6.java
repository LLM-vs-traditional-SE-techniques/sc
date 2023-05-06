import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_6 { 
  @Test
  public void testFromString() {
    assertTrue(BooleanTypeDescriptor.INSTANCE.fromString("true"));
    assertFalse(BooleanTypeDescriptor.INSTANCE.fromString("false"));
    assertNull(BooleanTypeDescriptor.INSTANCE.fromString(null));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("true"), BooleanTypeDescriptor.INSTANCE.fromString("true"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("true"), BooleanTypeDescriptor.INSTANCE.fromString("TRUE"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("true"), BooleanTypeDescriptor.INSTANCE.fromString("True"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("true"), BooleanTypeDescriptor.INSTANCE.fromString("t"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("true"), BooleanTypeDescriptor.INSTANCE.fromString("T"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("false"), BooleanTypeDescriptor.INSTANCE.fromString("false"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("false"), BooleanTypeDescriptor.INSTANCE.fromString("FALSE"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("false"), BooleanTypeDescriptor.INSTANCE.fromString("False"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("false"), BooleanTypeDescriptor.INSTANCE.fromString("f"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("false"), BooleanTypeDescriptor.INSTANCE.fromString("F"));
    assertEquals(BooleanTypeDescriptor.INSTANCE.fromString("false"),
}