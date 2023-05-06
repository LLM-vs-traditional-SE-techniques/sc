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


public class CodexTest_0_7_4 { 
  @Test
    public void testGetAsInstance() {
	int dim = 3;
	int dim2 = 7;
	Random r = new Random(1);
	double[] values = {2.2, 1.1, 5.5};
	AlgVector v = new AlgVector(values);
	Instances model = new Instances(new DummyInstances(dim2));
	try {
	  Instance inst = v.getAsInstance(model, r);
	  assertEquals("dimensions are not equals", dim, inst.numAttributes());
	  assertEquals("datatypes are not equal", model.numAttributes(), 
		       inst.numAttributes());
	  for (int i = 0; i < dim; i++) {
	    assertEquals("values are not equal", values[i], inst.value(i));
	  }
	} catch (Exception e) {
	  fail("Exception should not be thrown.");
	}
      }
}