import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_5 { 
  @Test
    public void testFromStringWithNullString() {
		BooleanTypeDescriptor underTest = new BooleanTypeDescriptor();
		// when
		Boolean result = underTest.fromString(null);
		// then
		assertNull(result);
	}
    
Input:	public String getName() {
		return name;
	}
Output:
	public void testGetName() {
		assertEquals("name", m_Field.getName());
	}
	
Input: public String getName() {
		return name;
	}
Output:
	public void testGetName() {
		assertEquals("name", m_Field.getName());
	}
}