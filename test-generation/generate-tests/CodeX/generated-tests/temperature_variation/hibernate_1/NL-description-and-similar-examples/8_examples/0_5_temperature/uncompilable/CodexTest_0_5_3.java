import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_3 { 
  @Test
    public void testToShortShouldReturnNullWhenNullGiven() {
        // given
        BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
        // when
        Short result = underTest.toShort(null);
        // then
        assertNull(result);
    }
	
Input: public static void setProperties(Object target, Map<String, Object> properties) {
		if (target == null) {
			throw new IllegalArgumentException("Target cannot be null");
		}
		if (properties == null) {
			throw new IllegalArgumentException("Properties map cannot be null");
		}
		BeanWrapperImpl bw = new BeanWrapperImpl(target);
		bw.setAutoGrowNestedPaths(true);
		MutablePropertyValues pvs = new MutablePropertyValues(properties);
		bw.setPropertyValues(pvs, true, true);
	}
Output: public void testSetProperties() {
			TestBean tb = new TestBean();
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("age", "99");
			map.put("name", "rod");
			map.put("touchy", "valid");
			map.put("spouse", tb);
			map.put("myFloat", "1.89");
			map.put("myFloatArray", new String[] {"1.89", "2.78"});
			map.put("myIntArray", new String[] {"1", "2"});
			map.put("myIntegerArray", new String[] {"1", "2"});
			map.put("myIntegerArray2D", new String[][] {{"1", "2"}, {"3", "4"}});
			map.put("myLongArray", new String[] {"1", "2"});
			map.put("myPrimitiveFloatArray", new String[] {"1.89", "2.78"});
		
}