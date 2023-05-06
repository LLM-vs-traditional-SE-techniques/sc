import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_21 { 
  @Test
  public void testFromString() {
        // given
        BooleanTypeDescriptor type = new BooleanTypeDescriptor();
        // when
        Boolean result = type.fromString("true");
        // then
        assertTrue(result);
    }

}