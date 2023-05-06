import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_7 { 
  @Test
  public void testToInt_withTrueArgument() throws Exception {
    EasyMock.expect(simpleTestInterfaceMock.returnTrue()).andReturn(Boolean.TRUE).once();
    EasyMock.replay(simpleTestInterfaceMock);
    assertEquals((short) 1, model.simpleTestMethod(true));
  }
}