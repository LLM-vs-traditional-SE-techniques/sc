import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_33 { 
  @Test
    public void testFromString() {
        Boolean value = Boolean.valueOf(true);
        String string = value.toString();
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        assertEquals(value, underTest.fromString(string));
    }
}