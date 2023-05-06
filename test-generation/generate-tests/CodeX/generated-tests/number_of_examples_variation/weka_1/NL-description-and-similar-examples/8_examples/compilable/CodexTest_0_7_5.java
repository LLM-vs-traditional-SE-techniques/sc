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


public class CodexTest_0_7_5 { 
  @Test
   public void testAdd() {
			double[] data1 = {1.0, 2.0, 3.0};
			double[] data2 = {4.0, 5.0, 6.0};
			AlgVector v1 = new AlgVector(data1);
			AlgVector v2 = new AlgVector(data2);
			AlgVector v3 = v1.add(v2);
			double eps = 1e-9;
			for (int i = 0; i < v1.numElements(); i++) {
				assertEquals((i+1) + ". value differs", data1[i] + data2[i], v3.getElement(i), eps);
			}
		}
}