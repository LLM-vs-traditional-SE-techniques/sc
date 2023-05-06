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


public class CodexTest_0_1_6 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Random random = new Random(1);
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation Test\n" +
					"@attribute a numeric\n" +
					"@attribute b numeric\n" +
					"@attribute c numeric\n" +
					"@data\n" +
					"1,2,3\n" +
					"4,5,6\n" +
					"7,8,9\n"
					)));
			Instance inst = v.getAsInstance(model, random);
			assertEquals("Number of attributes differs", model.numAttributes(), inst.numAttributes());
			assertEquals("Number of values differs", model.numAttributes(), inst.numValues());
			assertEquals("Dataset differs", model, inst.dataset());
			assertEquals("1. value differs", data[0], inst.value(0), 1.0e-12);
			assertEquals("2. value differs", data[1], inst.value(1), 1.0e-12);
			assertEquals("3. value differs", data[2], inst.value(2), 1.0e-12);
		  }
}