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


public class CodexTest_0_2_12 { 
  @Test
    public void testGetAsInstance() {
			AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
			Instances model = new Instances(new FastVector(), 0);
			model.insertAttributeAt(new Attribute("a"), 0);
			model.insertAttributeAt(new Attribute("b"), 1);
			model.insertAttributeAt(new Attribute("c"), 2);
			model.insertAttributeAt(new Attribute("d"), 3);
			model.insertAttributeAt(new Attribute("e"), 4);
			model.insertAttributeAt(new Attribute("f"), 5);
			try {
			  Instance inst = v.getAsInstance(model, new Random(1));
			  assertEquals("a", 0.0, inst.value(0));
			  assertEquals("b", 1.0, inst.value(1));
			  assertEquals("c", 2.0, inst.value(2));
			  assertEquals("d", 0.0, inst.value(3));
			  assertEquals("e", 0.0, inst.value(4));
			  assertEquals("f", 0.0, inst.value(5));
			} catch (Exception e) {
			  fail("Exception: " + e.getMessage());
			}
		  }
}