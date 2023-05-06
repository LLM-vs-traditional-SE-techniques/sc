import org.hibernate.type.descriptor.java.*;
import org.hibernate.type.descriptor.WrapperOptions;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;


import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_7 { 
  @Test
    
Input: public void setX(double x) {
			this.x = x;
		}
Output: public void testCoordinates() {
			Vector1D v = new Vector1D(1);
			Assert.assertTrue(FastMath.abs(v.getX() - 1) < 1.0e-12);
		}
}