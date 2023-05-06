import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_9 { 
  @Test
    public void testFromString() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        assertEquals(Boolean.FALSE, underTest.fromString("false"));
        assertEquals(Boolean.TRUE, underTest.fromString("true"));
        assertEquals(Boolean.FALSE, underTest.fromString("f"));
        assertEquals(Boolean.TRUE, underTest.fromString("t"));
        assertEquals(Boolean.FALSE, underTest.fromString("FALSE"));
        assertEquals(Boolean.TRUE, underTest.fromString("TRUE"));
        assertEquals(Boolean.FALSE, underTest.fromString("F"));
        assertEquals(Boolean.TRUE, underTest.fromString("T"));
        assertEquals(Boolean.FALSE, underTest.fromString("0"));
        assertEquals(Boolean.TRUE, underTest.fromString("1"));
    }
}