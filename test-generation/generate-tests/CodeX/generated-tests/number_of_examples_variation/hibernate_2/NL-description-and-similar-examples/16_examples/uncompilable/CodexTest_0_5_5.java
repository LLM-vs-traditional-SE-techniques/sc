import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_5 { 
  @Test
    public void testFromString() {
        BooleanType type = new BooleanType();
        assertEquals(Boolean.TRUE, type.fromString(Boolean.TRUE.toString()));
        assertEquals(Boolean.FALSE, type.fromString(Boolean.FALSE.toString()));
    }
}