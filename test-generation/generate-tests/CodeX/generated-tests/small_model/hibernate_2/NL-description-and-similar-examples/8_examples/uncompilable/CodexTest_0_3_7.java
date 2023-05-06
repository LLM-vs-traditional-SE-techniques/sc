import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_7 { 
  @Test
  public void testBooleanFromString() {
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("true"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("TRUE"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("True"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("t"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("T"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("1"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("y"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("Y"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("yes"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("YES"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("Yes"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("on"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("ON"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("On"));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString("1"));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString("false"));
    assertEquals(Boolean.F
}