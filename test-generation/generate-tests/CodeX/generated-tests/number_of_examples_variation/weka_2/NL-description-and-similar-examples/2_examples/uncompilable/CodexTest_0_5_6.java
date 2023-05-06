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


public class CodexTest_0_5_6 { 
  @Test
    public void testGetAsInstance() throws Exception {
			double[] data = {1.3, 2.2, 3.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new BufferedReader(
					new StringReader("@RELATION test\n@ATTRIBUTE a NUMERIC\n@ATTRIBUTE b NUMERIC\n@ATTRIBUTE c NUMERIC\n@DATA\n1.0,2.0,3.0")));
			Instance inst = v.getAsInstance(model, new Random());
			assertEquals("Number of attributes differs", model.numAttributes(), inst.numAttributes());
			for (int i = 0; i < model.numAttributes(); i++) {
				assertEquals("Attribute differs", model.attribute(i), inst.attribute(i));
			}
			assertEquals("Value differs", data[0], inst.value(0), 0.001);
			assertEquals("Value differs", data[1], inst.value(1), 0.001);
			assertEquals("Value differs", data[2], inst.value(2), 0.001);
		
}