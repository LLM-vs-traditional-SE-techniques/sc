import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_58 { 
  @Test
    /**
     * Test method for {@link com.example.BooleanTypeDescriptor#toShort(java.lang.Boolean)}.
     */
    public void testToShort() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        assertEquals(1, (short) underTest.toShort(true));
    }
}