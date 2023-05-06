import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_85 { 
  @Test
  public void testFromStringString() {
    MongodbBooleanConverter converter = new MongodbBooleanConverter();
    assertTrue(converter.fromString("true"));
    assertTrue(converter.fromString(String.valueOf(true)));
    assertFalse(converter.fromString("false"));
    assertFalse(converter.fromString(String.valueOf(false)));
  }
}