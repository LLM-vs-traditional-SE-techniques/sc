import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_52 { 
  @Test
  public void testByteToShort() {
    ByteTypeDescriptor underTest = new ByteTypeDescriptor();
    short result = underTest.toShort((byte) 1);
    assertEquals((short) 1, result);
  }
}