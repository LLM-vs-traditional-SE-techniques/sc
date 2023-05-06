import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_9 { 
  @Test
        
Input: public void setAge(int age) {
		this.age = age;
	}
Output: public void testAge() {
		Person p = new Person();
		p.setAge(10);
		Assert.assertEquals(p.getAge(), 10);
	}
}