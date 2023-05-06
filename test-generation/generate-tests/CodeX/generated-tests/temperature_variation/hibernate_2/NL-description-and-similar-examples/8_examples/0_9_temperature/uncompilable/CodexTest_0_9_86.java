import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_86 { 
  @Test
    public void testFromStringForDefault() {
        assertFalse(BooleanType.INSTANCE.fromString(null));
        assertFalse(BooleanType.INSTANCE.fromString(""));
        assertFalse(BooleanType.INSTANCE.fromString("  "));
    }
}