import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_4 { 
  @Test
    public void testFromString() {
        for (Boolean value : new Boolean[] { Boolean.TRUE, Boolean.FALSE }) {
            assertEquals(value, Boolean.valueOf( value.toString() ));
            assertSame(value, Boolean.valueOf( value.toString() ));
            assertEquals(value, Boolean.fromString( value.toString() ));
            assertSame(value, Boolean.fromString( value.toString() ));
        }
    }
}