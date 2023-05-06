import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_17 { 
  @Test
        public void testFromString() {
            Assert.assertEquals(false, BooleanTypeDescriptor.INSTANCE.fromString("false"));
            Assert.assertEquals(true, BooleanTypeDescriptor.INSTANCE.fromString("true"));
        }
}