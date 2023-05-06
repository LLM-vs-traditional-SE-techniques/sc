import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_10 { 
  @Test
  public void testToShort() {
        for (int i = -32768; i <= 32768; i++) {
            Short s = Short.valueOf((short) i);
            assertEquals((short) i, (short) NumberUtils.toShort(s));
            assertEquals((short) i, (short) NumberUtils.toShort(String.valueOf(i)));
        }
        try {
            NumberUtils.toShort("9.0");
            fail("Should have thrown a NumberFormatException");
        } catch (NumberFormatException ex) {
            // expected
        }
        try {
            NumberUtils.toShort(null);
            fail("Should have thrown a NumberFormatException");
        } catch (NumberFormatException ex) {
            // expected
        }
    }
}