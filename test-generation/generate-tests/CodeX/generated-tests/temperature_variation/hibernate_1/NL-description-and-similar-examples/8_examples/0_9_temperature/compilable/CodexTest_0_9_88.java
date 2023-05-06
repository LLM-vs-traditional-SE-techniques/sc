import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_88 { 
                    @Test
                    public void testToShortShouldReturnNull() {
                      // given
                      BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
                      // when
                      Short result = underTest.toShort(null);
                      // then
                      assertNull(result);
                    }
                    @Test
                    public void testToShort() {
                      // given
                      BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
                      // when
                      Short result = underTest.toShort(Boolean.TRUE);
                      // then
                      assertTrue(result == 1);
                    }
                    @Test
                    public void testToShortShouldReturnFalse() {
                      // given
                      BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
                      // when
                      Short result = underTest.toShort(Boolean.FALSE);
                      // then
                      assertTrue(result == 0);
                    }
}