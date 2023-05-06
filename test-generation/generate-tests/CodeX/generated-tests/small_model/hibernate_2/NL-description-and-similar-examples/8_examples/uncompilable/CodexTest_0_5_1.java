import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_1 { 
  @Test
  public void testFromString() {
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("true", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("True", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("false", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("False", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("1", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("0", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("True", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("False", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("yes", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("no", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("on", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("off", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("y", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("n", null));
    assertEquals(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.wrap("Y", null));
    assertEquals(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.wrap("N", null));
    assertEquals(Boolean.TRUE, Boolean
}