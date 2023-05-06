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


public class CodexTest_0_9_60 { 
  @Test
     public void testAdd() {
			double[] data = {2.2, 3.0, 4.2, 7.8};
			double[] data2 = {3.3, 1.2, 0.0, 5.2};
			double[] res = {5.5, 4.2, 4.2, 13.0};
			AlgVector v = new AlgVector(data);
			AlgVector v2 = new AlgVector(data2);
			AlgVector b = v.add(v2);
			for (int i = 0; i < data.length; i++)
			  assertEquals((i+1) + ". value differs", res[i], b.getElement(i));
		  }
}