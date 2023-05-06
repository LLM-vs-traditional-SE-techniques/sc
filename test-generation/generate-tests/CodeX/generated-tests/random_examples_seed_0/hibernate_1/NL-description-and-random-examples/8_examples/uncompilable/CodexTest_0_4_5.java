import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_5 { 
  @Test
    public void testBooleanToShort() {
        Short s = BooleanUtils.toShortObject(true);
        assertTrue("Boolean to short conversion failed", s.shortValue() == 1);
    }
}