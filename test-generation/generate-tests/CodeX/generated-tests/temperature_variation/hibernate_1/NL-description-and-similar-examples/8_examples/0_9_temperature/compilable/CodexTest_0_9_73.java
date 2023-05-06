import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_73 { 
  @Test
    public void testToShortShouldReturn1WhenTrueIsGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        short result = underTest.toShort(Boolean.TRUE);
        //then
        short expected = 1;
        assertEquals(expected, result);
    }
}