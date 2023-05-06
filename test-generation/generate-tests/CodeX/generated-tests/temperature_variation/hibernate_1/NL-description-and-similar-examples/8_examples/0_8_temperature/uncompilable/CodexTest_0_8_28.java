import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_28 { 
  @Test
    public void testToShortShouldReturn123When123IntegerGiven() {
        // given
        IntegerTypeDescriptor underTest = new IntegerTypeDescriptor();
        // when
        Short result = underTest.toShort(123);
        // then
        asserEquals(new Short(123), result);
    }
}