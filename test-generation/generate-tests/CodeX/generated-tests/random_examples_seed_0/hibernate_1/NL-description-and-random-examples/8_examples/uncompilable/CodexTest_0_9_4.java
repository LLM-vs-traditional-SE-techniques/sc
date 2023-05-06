import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_4 { 
  @Test
    public void testLong() {
        assertEquals(127,   typeConvert.toLong(byteValue));
        assertEquals(127,   typeConvert.toLong(shortValue));
        assertEquals(127,   typeConvert.toLong(intValue));
        assertEquals(127,   typeConvert.toLong(longValue));
        assertEquals(127L,  typeConvert.toLong(floatValue));
        assertEquals(127L,  typeConvert.toLong(doubleValue));
        assertEquals(0,     typeConvert.toLong(falseValue));
        assertEquals(1,     typeConvert.toLong(trueValue));
        assertEquals(127, typeConvert.toLong(charValue));
        assertEquals(0,     typeConvert.toLong(null));
        assertEquals(0,     typeConvert.toLong(""));
        assertEquals(127,   typeConvert.toLong("127"));
        assertEquals(0,     typeConvert.toLong("127.0"));
    }
}