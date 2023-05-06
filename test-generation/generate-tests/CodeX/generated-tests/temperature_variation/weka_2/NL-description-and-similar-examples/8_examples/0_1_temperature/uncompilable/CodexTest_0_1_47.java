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


public class CodexTest_0_1_47 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("a1"), 0);
			model.insertAttributeAt(new Attribute("a2"), 1);
			model.insertAttributeAt(new Attribute("a3"), 2);
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("Number of attributes differs", model.numAttributes(), inst.numAttributes());
			assertEquals("1. attribute differs", data[0], inst.value(0));
			assertEquals("2. attribute differs", data[1], inst.value(1));
			assertEquals("3. attribute differs", data[2], inst.value(2));
		  }
}