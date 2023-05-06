import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_5 { 
  @Test
        public void testFromString() {
        // TODO Auto-generated method stub
        Boolean result = BooleanConverter.fromString("true");
        assertTrue(result);
        result = BooleanConverter.fromString("false");
        assertFalse(result);
        result = BooleanConverter.fromString("TRUE");
        assertTrue(result);
        result = BooleanConverter.fromString("FALSE");
        assertFalse(result);
    }
}