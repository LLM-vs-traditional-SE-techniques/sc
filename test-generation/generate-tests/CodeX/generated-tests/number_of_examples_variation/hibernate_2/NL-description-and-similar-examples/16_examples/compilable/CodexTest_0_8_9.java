import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
    public void testFromStringMethod() {
        String input = "1";
        String expected = "true";
        Boolean actual = Boolean.valueOf(input);
        assertEquals(expected, actual.toString());
    }
}