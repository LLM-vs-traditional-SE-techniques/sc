import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_43 { 
    @Test
    public void testFromStringFalse() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        assertFalse(underTest.fromString("false"));
    }
}