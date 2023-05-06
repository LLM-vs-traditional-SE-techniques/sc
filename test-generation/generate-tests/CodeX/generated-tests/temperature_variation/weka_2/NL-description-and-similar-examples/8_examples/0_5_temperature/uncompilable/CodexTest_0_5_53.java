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


public class CodexTest_0_5_53 { 
  @Test
  public void testGetAsInstance() throws Exception {
			double[] data = { 2.3, 1.2, 5.0 };
			AlgVector v = new AlgVector(data);
			Instances dataset = new Instances(new BufferedReader(
					new StringReader(AlgVectorTest.DATASET)));
			dataset.setClassIndex(dataset.numAttributes() - 1);
			Instance inst = v.getAsInstance(dataset, new Random(0));
			assertEquals("Number of attributes differ", dataset.numAttributes(),
					inst.numAttributes());
			assertTrue("Number of values differ", inst.numValues() >= data.length);
			for (int i = 0; i < data.length; i++)
				assertEquals((i + 1) + ". value differs", data[i], inst.value(i));
		}
}