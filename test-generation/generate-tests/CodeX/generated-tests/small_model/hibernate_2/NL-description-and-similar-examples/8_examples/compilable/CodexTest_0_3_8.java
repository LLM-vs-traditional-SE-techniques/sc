import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_8 { 
  @Test
    public void testFromStringShouldReturnTrueWhenYStringGiven() {
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        Boolean result = underTest.fromString("Y");
        assertTrue(result);
    }
}