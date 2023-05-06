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


public class CodexTest_0_5_70 { 
  @Test
    public void testGetAsInstance() {
			Attribute attr = new Attribute("test");
			Instances inst = new Instances("test", new ArrayList<Attribute>(), 0);
			inst.insertAttributeAt(attr, 0);
			double[] data = {1.0, 2.0, 3.0};
			AlgVector v = new AlgVector(data);
			try {
				Instance inst1 = v.getAsInstance(inst, new Random(1));
				assertEquals(1.0, inst1.value(0), EPSILON);
				assertEquals(2.0, inst1.value(1), EPSILON);
				assertEquals(3.0, inst1.value(2), EPSILON);
			} catch (Exception e) {
				fail("Exception occured: " + e.getMessage());
			}
		}
}