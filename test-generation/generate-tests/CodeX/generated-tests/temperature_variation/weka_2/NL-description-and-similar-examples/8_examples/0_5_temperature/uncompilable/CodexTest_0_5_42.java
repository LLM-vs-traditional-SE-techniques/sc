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


public class CodexTest_0_5_42 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("A1"), 0);
			model.insertAttributeAt(new Attribute("A2"), 1);
			model.insertAttributeAt(new Attribute("A3"), 2);
			model.insertAttributeAt(new Attribute("A4"), 3);
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("Number of attributes differs", model.numAttributes(), inst.numAttributes());
			assertEquals("1. value differs", 2.3, inst.value(0));
			assertEquals("2. value differs", 1.2, inst.value(1));
			assertEquals("3. value differs", 5.0, inst.value(2));
			assertEquals("4. value differs", 0.0, inst.value(3));
		  }
}