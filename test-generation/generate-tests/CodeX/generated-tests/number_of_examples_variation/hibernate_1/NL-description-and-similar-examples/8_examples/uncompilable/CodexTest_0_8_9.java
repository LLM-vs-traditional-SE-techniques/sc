import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_9 { 
  @Test
  public void testToShortFunction() {
    TestUtil.runAndVerifyTest(new TestUtil.Function() {
        public void run(Object[] args) {
          assertEquals(Short.valueOf((short) 1),
              ShortTypeDescriptor.INSTANCE.toShort((Boolean) args[0]));
        }
    }, new Object[] {Boolean.TRUE});
    TestUtil.runAndVerifyTest(new TestUtil.Function() {
        public void run(Object[] args) {
          assertEquals(Short.valueOf((short) 0),
              ShortTypeDescriptor.INSTANCE.toShort((Boolean) args[0]));
        }
    }, new Object[] {Boolean.FALSE});
  }
}