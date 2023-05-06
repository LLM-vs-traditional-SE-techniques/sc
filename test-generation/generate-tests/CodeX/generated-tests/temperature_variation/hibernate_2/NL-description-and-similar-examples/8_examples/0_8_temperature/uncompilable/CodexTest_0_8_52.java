import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_52 { 
  @Test
  public void testFromString() {
    Boolean desc1 = new BooleanTypeDescriptor().fromString(String.valueOf(Boolean.TRUE));
    Boolean desc2 = new BooleanTypeDescriptor().fromString(String.valueOf(Boolean.FALSE));
    assertEquals(Boolean.valueOf(true), desc1);
    assertEquals(Boolean.valueOf(false), desc2);
  }
*/
public void testMethodWithBooleanFromStringSignature() {
  setTestUnitContent(
      "class Test {",
      "  Boolean a(String s) {}",
      "}");
  assert_runSucceeds(null, "// filler filler filler filler filler filler filler filler filler filler",
      "Test t;",
      "boolean b;",
      "t.a(null);",
      "");
  assertEquals(
      ImmutableList.of("public void testA() {",
      "  assertNull(new Test().a(null));",
      "}"),
      getTestUnitResults());
}
}