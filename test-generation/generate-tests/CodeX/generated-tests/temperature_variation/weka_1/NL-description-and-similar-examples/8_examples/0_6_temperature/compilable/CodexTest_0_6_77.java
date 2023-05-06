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


public class CodexTest_0_6_77 { 
  @Test
     public void testAdd() {
			double[] data1 = {1.1, 2.2, 3.3};
			double[] data2 = {4.4, 5.5, 6.6};
			AlgVector vector1 = new AlgVector(data1);
			AlgVector vector2 = new AlgVector(data2);
			AlgVector vector3 = vector1.add(vector2);
			double[] result = {5.5, 7.7, 9.9};
			for (int i = 0; i < 3; i++)
			  assertEquals(i + 1 + ". value differs", result[i], vector3.getElement(i));
		  }
}