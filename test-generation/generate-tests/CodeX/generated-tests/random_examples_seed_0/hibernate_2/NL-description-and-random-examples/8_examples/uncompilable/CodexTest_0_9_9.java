import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_9 { 
  @Test
        public void testObjectHashCode() {
            HashCode hashCode42 = HashCode.fromInt(42);
            assertEquals(42, hashCode42.hashCode());
        }
}