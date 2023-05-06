import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_8 { 
  @Test
  public void testToShort() {
        BooleanType booleanType = new BooleanType();
        Short outputValue = booleanType.toShort(Boolean.FALSE);
        assertEquals(Number.class, outputValue.getClass());
        assertEquals(0, outputValue.shortValue());
    }
}