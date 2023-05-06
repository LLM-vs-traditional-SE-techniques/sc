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


public class CodexTest_0_6_70 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Random r = new Random(0);
			
			try {
				Instance instance = v.getAsInstance(null, r);
				assertNull(instance);
			} catch (Exception e) {
				fail();
			}
			
			try {
				Instances dataset = new Instances(new FileReader("datasets/iris.arff"));
				Instance instance = v.getAsInstance(dataset, r);
				assertNotNull(instance);
				assertEquals(data.length,instance.numAttributes());
				for (int i = 0; i < data.length; i++)
					assertEquals(data[i],instance.value(i));
			} catch (Exception e) {
				fail();
			}
		}
}