import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_5 { 
  @Test
    public void testFromString() {
        assertEquals(Boolean.TRUE, new BooleanTypeDescriptor().fromString("true"));
        assertEquals(Boolean.FALSE, new BooleanTypeDescriptor().fromString("false"));
        assertEquals(Boolean.FALSE, new BooleanTypeDescriptor().fromString(""));
        assertEquals(Boolean.FALSE, new BooleanTypeDescriptor().fromString("\n"));
        assertEquals(Boolean.FALSE, new BooleanTypeDescriptor().fromString("\t"));
        assertEquals(Boolean.FALSE, new BooleanTypeDescriptor().fromString(" "));
        assertEquals(Boolean.FALSE, new BooleanTypeDescriptor().fromString(null));
    }
}