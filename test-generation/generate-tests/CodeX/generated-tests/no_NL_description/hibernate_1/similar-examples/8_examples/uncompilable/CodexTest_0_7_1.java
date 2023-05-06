import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_1 { 
  @Test
  public void testToShort() {
        // given
        ShortTypeDescriptor underTest = new ShortTypeDescriptor();
        // when
        Short result = underTest.toShort(Boolean.TRUE);
        // then
        assertEquals(new Short((short) 1), result);
    }
}