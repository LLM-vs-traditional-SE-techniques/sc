import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_40 { 
  @Test
  public void testFromString() {
    assertEquals(null, booleanTypeDescriptor.fromString(null));
    assertEquals(null, booleanTypeDescriptor.fromString(""));
    assertEquals(null, booleanTypeDescriptor.fromString(" "));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("true"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("false"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("True"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("False"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("TRUE"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("FALSE"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("t"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("f"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("T"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("F"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("yes"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("no"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("Yes"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("No"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("YES"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("NO"));
    assertEquals(Boolean.TRUE, booleanTypeDescriptor.fromString("y"));
    assertEquals(Boolean.FALSE, booleanTypeDescriptor.fromString("n"));

}