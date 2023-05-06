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


public class CodexTest_0_8_5 { 
  @Test
  public void testAdd() {
			double[] x = {1.1, 2.2, 3.3, 4.4};
			double[] y = {2.2, 3.3, 4.4, 5.5};
			AlgVector v = new AlgVector(x);
			AlgVector w = new AlgVector(y);
			AlgVector z = v.add(w);
			assertEquals("Length differs", x.length, z.numElements());
			for (int i = 0; i < x.length; i++)
			  assertEquals((i+1) + ". element differs", x[i]+y[i], z.getElement(i));
		  }
}