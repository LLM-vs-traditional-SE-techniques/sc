import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
      public void testFromStringWithInvalidStringShouldReturnFalse() throws Exception {
        //given
        BooleanTypeDescriptor descriptor = new BooleanTypeDescriptor();
        //when
        Boolean bool = descriptor.fromString("falseee");
        //then
        assertFalse(bool);
    }
}