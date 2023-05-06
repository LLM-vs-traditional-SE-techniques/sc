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


public class CodexTest_0_5_85 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new Instances("test", new ArrayList<Attribute>(), 0));
			model.add(new Attribute("att1"));
			model.add(new Attribute("att2"));
			model.add(new Attribute("att3"));
			try {
				Instance inst = v.getAsInstance(model, new Random(1));
				assertEquals("Attribute values differ", data[0], inst.value(0));
				assertEquals("Attribute values differ", data[1], inst.value(1));
				assertEquals("Attribute values differ", data[2], inst.value(2));
			} catch (Exception e) {
				fail("Exception occurred: " + e.getMessage());
			}
		  }
}