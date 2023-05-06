import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_4 { 
  @Test
        public void testFromString() {
        String trueString = "true";
        Boolean trueBoolean = Boolean.TRUE;
        assertEquals("fromString(String) failed for a String containing true",
                trueBoolean, Boolean.valueOf(trueString));
        String falseString = "false";
        Boolean falseBoolean = Boolean.FALSE;
        assertEquals("fromString(String) failed for a String containing false",
                falseBoolean, Boolean.valueOf(falseString));
        String badString = "junk";
        try
        {
            Boolean b = Boolean.valueOf(badString);
            System.out.println("Boolean.fromString(\"" + badString + "\") returned " + b);
            fail("fromString(String) failed to throw an exception when passed a bad String");
        } catch (Exception e) {
        }
    }
}