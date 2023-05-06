import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_45 { 
    @Test
    public void testFromStringToBoolean() {
        MyObject myObject = new MyObject("true");
        Boolean b = MyObject.fromString("true");
        assertTrue("Expected: true, result: " + b, b);
    }
    @Test
    public void testFromStringToBooleanFails() {
        MyObject myObject = new MyObject("trazise");
        Boolean b = MyObject.fromString("trazise");
        assertFalse("Expected: false, result: " + b, b);
    }
}