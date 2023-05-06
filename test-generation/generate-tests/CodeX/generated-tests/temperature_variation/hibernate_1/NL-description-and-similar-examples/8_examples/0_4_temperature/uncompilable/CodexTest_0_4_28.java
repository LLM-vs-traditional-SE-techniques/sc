import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_28 { 
  @Test
    
Input: public final void setElement(int index, double value) {
			m_Elements[index] = value;
		  }
Output: public void testSetElement() {
			AlgVector v = new AlgVector(2);
			v.setElement(0, 2.3);
			v.setElement(1, 1.2);
			assertEquals(2.3, v.getElement(0));
			assertEquals(1.2, v.getElement(1));
		  }
}