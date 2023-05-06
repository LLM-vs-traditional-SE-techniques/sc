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


public class CodexTest_0_1_39 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("A"), 0);
			model.insertAttributeAt(new Attribute("B"), 1);
			model.insertAttributeAt(new Attribute("C"), 2);
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("A", 2.3, inst.value(0), 1e-6);
			assertEquals("B", 1.2, inst.value(1), 1e-6);
			assertEquals("C", 5.0, inst.value(2), 1e-6);
		  }
}