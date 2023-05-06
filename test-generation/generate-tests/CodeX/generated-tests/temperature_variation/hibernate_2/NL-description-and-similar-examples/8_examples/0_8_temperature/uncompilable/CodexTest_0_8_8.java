import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_8 { 
  @Test
    public void testFromStringShouldWrapTrueWhenTrueStringGiven() {
        // given
        BooleanType booleanType = new BooleanType();
        // when
        Boolean result = booleanType.fromString("true");
        // then
        assertTrue(result);
    }
    public void testFromStringShouldWrapFalseWhenFalseStringGiven() {
        // given
        BooleanType booleanType = new BooleanType();
        // when
        Boolean result = booleanType.fromString("false");
        // then
        assertFalse(result);
    }

}