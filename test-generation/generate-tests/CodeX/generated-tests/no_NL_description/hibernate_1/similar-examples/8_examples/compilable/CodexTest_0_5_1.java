import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_1 { 
  @Test
    public void testToShort() {
        assertEquals(new Short((short) 1), new BooleanTypeDescriptor().toShort(Boolean.TRUE));
        assertEquals(new Short((short) 0), new BooleanTypeDescriptor().toShort(Boolean.FALSE));
        assertEquals(new Short((short) 1), new BooleanTypeDescriptor().toShort(Boolean.TRUE));
        assertEquals(new Short((short) 0), new BooleanTypeDescriptor().toShort(Boolean.FALSE));
        assertNull(new BooleanTypeDescriptor().toShort(null));
    }
}