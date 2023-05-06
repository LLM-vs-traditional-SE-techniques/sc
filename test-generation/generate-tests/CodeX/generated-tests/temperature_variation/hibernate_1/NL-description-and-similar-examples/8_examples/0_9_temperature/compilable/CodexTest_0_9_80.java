import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_80 { 
  @Test
    public void testToIntIsTrueWhenValueIsFalseAndNoneOptionUsed() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        int result = underTest.toInt(false);
        // then
        assertEquals(0, result);
    }
}