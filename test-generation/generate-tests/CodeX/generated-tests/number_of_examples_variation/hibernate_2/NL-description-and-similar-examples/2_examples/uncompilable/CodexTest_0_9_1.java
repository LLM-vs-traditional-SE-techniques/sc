import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_1 { 
  /**
	 *
	 */
	@Test
	public void testFromString_caseFalseGiven() {
		// given
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString("false");
		// then
		assertFalse(result);
// given		
	}
	
Input: public static int indexOf(Object[] arr, Object key) {
    if (null == arr) {
      return -1;
    }
    return indexOf(arr, key, 0, arr.length);
  }
Output:
  @Test
  public void testIndexOf_caseArrNotNullAndKeyNullGiven() {
    // given
    int expected = -1;
    Object[] arr = new Object[]{new Object(), new Object(), new Object()};
    // when
    int result = Arrays.indexOf(arr, null, 0, arr.length);
    // then
    assertEquals(expected, result);
  }
}