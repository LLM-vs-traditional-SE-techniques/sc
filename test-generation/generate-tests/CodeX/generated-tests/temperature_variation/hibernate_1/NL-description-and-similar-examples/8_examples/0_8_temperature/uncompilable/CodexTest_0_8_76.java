import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_76 { 
  @Test
  
Input: public static int compare(final Date a, final Date b) {
	    if (a == null && b == null) return 0;
	    if (a == null) return -1;
	    if (b == null) return 1;
	    return a.compareTo(b);
	}
Output: public void testCompare() {
			Date a = new Date(1);
			Date b = new Date(2);
			assertEquals(-1, DateUtils.compare(a, b));
			assertEquals(0, DateUtils.compare(a, a));
			assertEquals(0, DateUtils.compare(b, b));
			assertEquals(0, DateUtils.compare(null, null));
			assertEquals(1, DateUtils.compare(b, a));
			assertEquals(-1, DateUtils.compare(null, a));
			assertEquals(1, DateUtils.compare(a, null));
		}
}