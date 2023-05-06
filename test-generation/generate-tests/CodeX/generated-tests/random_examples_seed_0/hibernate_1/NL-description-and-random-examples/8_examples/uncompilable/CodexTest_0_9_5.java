import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  private static final BooleanWrapper TRUE = new BooleanWrapper(true);
	private static final BooleanWrapper FALSE = new BooleanWrapper(false);
	@Test
	public void testHashCode() {
		Map<BooleanWrapper, Integer> map = new HashMap<BooleanWrapper, Integer>();
		map.put(TRUE,  0);
		assertEquals(0,  map.hashCode());
		map.put(FALSE, 1);
		assertEquals(1,  map.hashCode());
		map.put(FALSE, 1);
		assertEquals(1,  map.get(FALSE).intValue());
		assertFalse(map.equals(FALSE));
		assertTrue( map.equals(TRUE));
		assertFalse(map.equals(null));
}