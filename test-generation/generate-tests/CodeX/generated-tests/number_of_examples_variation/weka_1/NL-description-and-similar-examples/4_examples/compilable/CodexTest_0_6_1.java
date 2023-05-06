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


public class CodexTest_0_6_1 { 
  @Test
     public void testAddition() {
			double[] data = { 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0 };
			AlgVector v1 = new AlgVector(data);
			AlgVector v2 = new AlgVector(data);
			AlgVector v3 = v1.add(v2);
			for (int i = 0; i < data.length; i++) {
				assertEquals((i + 1) + ". value differs", data[i] + data[i], v3.getElement(i));
			}
		}
}