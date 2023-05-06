import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_5 { 
  @Test
    // Suggest a new test for the toInt method.
    public void testToIntShouldReturn0IfParamIsNull() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        int result = underTest.toInt(null);
        // then
        assertEquals(0, result);
    }
}