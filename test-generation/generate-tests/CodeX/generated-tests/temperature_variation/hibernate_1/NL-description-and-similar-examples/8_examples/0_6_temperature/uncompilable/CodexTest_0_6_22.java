import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_22 { 
  @Test
   public void testToShortShouldReturnShortForShort() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        short result = underTest.toShort((short) 1);
        // then
        assertEquals(1, result);
    }
}