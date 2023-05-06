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


public class CodexTest_0_1_3 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation Test\n" +
					"@attribute att1 numeric\n" +
					"@attribute att2 numeric\n" +
					"@attribute att3 numeric\n" +
					"@data\n" +
					"1.0, 2.0, 3.0\n" +
					"4.0, 5.0, 6.0\n" +
					"7.0, 8.0, 9.0\n"
					)));
			Instance inst = v.getAsInstance(model, new Random(1));
			assertEquals("Number of attributes differs", model.numAttributes(), inst.numAttributes());
			assertEquals("1. attribute differs", data[0], inst.value(0), 1e-15);
			assertEquals("2. attribute differs", data[1], inst.value(1), 1e-15);
			assertEquals("3. attribute differs", data[2], inst.value(2), 1e-15);
		  }
}