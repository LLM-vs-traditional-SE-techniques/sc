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


public class CodexTest_0_3_69 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("a1"), 0);
			model.insertAttributeAt(new Attribute("a2"), 1);
			model.insertAttributeAt(new Attribute("a3"), 2);
			model.setClassIndex(2);
			try {
			  Instance inst = v.getAsInstance(model, new Random(1));
			  assertEquals("Number of attributes differ",
				       model.numAttributes(), inst.numAttributes());
			  assertEquals("Number of values differ",
				       model.numValues(), inst.numValues());
			  assertEquals("Value differs", 2.3, inst.value(0));
			  assertEquals("Value differs", 1.2, inst.value(1));
			  assertEquals("Value differs", 5.0, inst.value(2));
			} catch (Exception e) {
			  fail("Exception: " + e.getMessage());
			}
		  }
}