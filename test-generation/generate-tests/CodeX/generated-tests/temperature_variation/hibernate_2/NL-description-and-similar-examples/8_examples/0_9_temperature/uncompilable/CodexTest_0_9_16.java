import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_16 { 
  @Test
    public void testShouldReturnFalseWhenNStringGiven() {
        // given
        BooleanType underTest = new BooleanType();
        // when
        Boolean result = underTest.fromString(N);
}