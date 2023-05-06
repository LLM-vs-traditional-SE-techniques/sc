import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_25 { 
  @Test
     public void testFromString() {
        for (String string : TRUE_STRINGS) {
            assertSame(Boolean.TRUE, BooleanTypeDescriptor.INSTANCE.fromString(string));
        }
        for (String string : FALSE_STRINGS) {
            assertSame(Boolean.FALSE, BooleanTypeDescriptor.INSTANCE.fromString(string));
        }
        try {
            BooleanTypeDescriptor.INSTANCE.fromString("foobar");
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            final Pattern TRUE_FALSE_PATTERN = Pattern.compile("was expecting either \\[true\\] or \\[false\\]", Pattern.CASE_INSENSITIVE);
            assertThat(e.getMessage(), Matchers.stringContainsInOrder(TRUE_FALSE_PATTERN));
        }
      }
}