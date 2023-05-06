import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_23 { 
  @Test
  public void testFromString() {
        String string = "true";
        Boolean expected = Boolean.valueOf(string);
        Boolean actual = fromString(string);
        assertEquals(string, expected, actual);
      }
}