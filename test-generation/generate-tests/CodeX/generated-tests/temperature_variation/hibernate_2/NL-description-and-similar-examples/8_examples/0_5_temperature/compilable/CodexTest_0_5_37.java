import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_37 { 
    @Test
    public void testFromString() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        assertTrue(underTest.fromString("true"));
        assertFalse(underTest.fromString("false"));
    }
}