import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
    public void testFromString()
    {
        Boolean b = Boolean.TRUE;
        assertEquals(b, new BooleanType().fromString("true"));
        assertEquals(Boolean.FALSE, new BooleanType().fromString("false"));
        try {
            new BooleanType().fromString("yada");
            fail("cast to Boolean should fail for non-boolean string");
        }
        catch (SerializationException se) {
            // expected
        }
        assertEquals(Boolean.FALSE, new BooleanType().fromString(""));
        assertEquals(Boolean.FALSE, new BooleanType().fromString(null));
    }
}