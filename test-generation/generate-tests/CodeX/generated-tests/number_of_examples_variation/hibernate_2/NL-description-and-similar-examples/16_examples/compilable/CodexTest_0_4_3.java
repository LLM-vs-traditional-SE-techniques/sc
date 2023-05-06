import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_3 { 
  @Test
    public void testFromString() {
        assertTrue(Boolean.TRUE.equals(BooleanTypeDescriptor.INSTANCE.fromString("true")));
        assertTrue(Boolean.FALSE.equals(BooleanTypeDescriptor.INSTANCE.fromString("false")));
    }
}