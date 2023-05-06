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


public class CodexTest_0_7_86 { 
  @Test
     public void testAdd() {
			AlgVector v1 = new AlgVector(new double[]{2.0, 3.0, 4.0});
			AlgVector v2 = new AlgVector(new double[]{10.0, 30.0, 40.0});
			AlgVector sum = v1.add(v2);
			for (int i = 0; i < v1.numElements(); i++) {
				assertEquals(v1.getElement(i) + v2.getElement(i), sum.getElement(i), 0.0);
			}
		}
}