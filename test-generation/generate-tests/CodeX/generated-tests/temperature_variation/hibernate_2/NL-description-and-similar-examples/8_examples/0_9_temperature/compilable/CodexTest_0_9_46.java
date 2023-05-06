import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_46 { 
  @Test
    public void testTrueString() {
			assertEquals(Boolean.TRUE, Boolean.valueOf("true"));
			assertEquals(Boolean.TRUE, Boolean.valueOf("TrUe"));
			assertEquals("Different object", Boolean.TRUE, Boolean.valueOf("true"));
			assertEquals("Different object", Boolean.TRUE, Boolean.valueOf("TrUe"));
		}

}