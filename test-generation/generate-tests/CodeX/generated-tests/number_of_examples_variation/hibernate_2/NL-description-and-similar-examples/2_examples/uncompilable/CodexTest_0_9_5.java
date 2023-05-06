import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_5 { 
  @Test
    public void testFromStringShouldReturnTrueWhenTrueStringGiven() {
			// given
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			// when
			Boolean result = underTest.fromString(TRUE_STRING);
			// then
			assertTrue(result);
		}
		public void testFromStringShouldReturnFalseWhenFalseStringGiven() {
			// given
			BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
			// when
			Boolean result = underTest.fromString(FALSE_STRING);
			// then
			assertFalse(result);
		} 
Input: 
public Tuple3<T1, T2, T3> getTuple3() {
    return new Tuple3<>(t1, t2, t3);
}
Output:
  public void testOutput() {
    Tuple3<Integer, Integer, Integer> result = MyClass.getTuple3();
    assertEquals(new Tuple3(3, 2, 1), result);
  }
}