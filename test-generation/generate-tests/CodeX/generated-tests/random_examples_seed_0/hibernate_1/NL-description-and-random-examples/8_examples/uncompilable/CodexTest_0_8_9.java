import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
    @Test
  public void testNegativeZero()
  {
    byte[] bytes = { 0, 0, 0, 0, 0, 0, -128, 2 };
    org.apache.thrift.protocol.TProtocol prot =
            new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(new java.io.ByteArrayInputStream(bytes)));
}