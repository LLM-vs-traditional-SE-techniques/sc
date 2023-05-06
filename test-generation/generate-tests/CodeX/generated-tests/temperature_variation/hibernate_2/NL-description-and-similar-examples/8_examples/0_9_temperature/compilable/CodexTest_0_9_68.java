import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_68 { 
  @Test
    public void testBooleanValueOf() {
        assertEquals(new Boolean(false), new Boolean(false));
        assertEquals(new Boolean(true), new Boolean(true));
        assertEquals(Boolean.TRUE, Boolean.valueOf(true));
        assertEquals(Boolean.FALSE, Boolean.valueOf(false));
        assertEquals(Boolean.valueOf(true), Boolean.valueOf(true));
        assertEquals(Boolean.valueOf(false), Boolean.valueOf(false));
    }

}