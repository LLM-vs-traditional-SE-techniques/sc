import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_79 { 
  @Test
        public void testToShortShouldReturnOneWhenTrueGiven() {
            //given
            LongTypeDescriptor underTest = new LongTypeDescriptor();
            // when
            Short result = underTest.toShort(true);
            // then
            assertEquals((short)1, result.shortValue());
        }
}