import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_27 { 
  @Test
    public void testFromStringTrue() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        assertTrue(underTest.fromString("true"));
        assertTrue(underTest.fromString("TrUe"));
        assertTrue(underTest.fromString("TRUE"));
    }

}