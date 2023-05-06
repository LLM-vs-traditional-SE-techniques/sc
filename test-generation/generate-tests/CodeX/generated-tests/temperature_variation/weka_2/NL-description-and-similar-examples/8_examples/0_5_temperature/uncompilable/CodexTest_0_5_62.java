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


public class CodexTest_0_5_62 { 
  @Test
    public void testGetAsInstance() {
		double[] data = {2.3, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		int num = v.numElements();
		Random random = new Random();
		Instances model = new Instances(new FastVector(), new FastVector());
		for (int i = 0; i < num; i++) {
			model.insertAttributeAt(new Attribute("att" + i), i);
		}
		
		Instance inst = v.getAsInstance(model, random);
		assertEquals(model.numAttributes(), inst.numAttributes());
		assertEquals(model.numInstances(), inst.numInstances());
	}
}