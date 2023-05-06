import weka.core.*;
import java.io.Serializable;
import java.util.Random;

import weka.core.*;
import java.util.Random;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_1 { 
  @Test
    public void testAdd() {
			AlgVector v1 = new AlgVector(4);
			v1.setElement(0, 1.0);
			v1.setElement(1, 2.0);
			v1.setElement(2, 3.0);
			v1.setElement(3, 4.0);
			AlgVector v2 = new AlgVector(4);
			v2.setElement(0, 4.0);
			v2.setElement(1, 3.0);
			v2.setElement(2, 2.0);
			v2.setElement(3, 1.0);
			AlgVector v3 = v1.add(v2);
			Assert.assertEquals(5.0, v3.getElement(0), 1.0e-12);
			Assert.assertEquals(5.0, v3.getElement(1), 1.0e-12);
			Assert.assertEquals(5.0, v3.getElement(2), 1.0e-12);
			Assert.assertEquals(5.0, v3.getElement(3), 1.0e-12);
		}
}