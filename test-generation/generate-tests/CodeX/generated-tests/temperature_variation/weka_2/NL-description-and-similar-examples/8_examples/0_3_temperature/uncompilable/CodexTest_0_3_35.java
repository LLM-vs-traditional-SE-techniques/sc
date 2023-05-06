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


public class CodexTest_0_3_35 { 
  @Test
    public void testGetAsInstance() {
			// given
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation Test-dataset\n" + "@attribute a numeric\n"
							+ "@attribute b numeric\n" + "@attribute c numeric\n"
							+ "@attribute d numeric\n" + "@data\n" + "1,2,3,4\n"
							+ "2,3,4,5\n" + "3,4,5,6\n")));
			double[] data = { 1, 2, 3, 4 };
			AlgVector vector = new AlgVector(data);
			// when
			Instance instance = vector.getAsInstance(model, new Random(1));
			// then
			assertNotNull(instance);
			assertEquals(4, instance.numAttributes());
			assertEquals(1.0, instance.value(0), 1e-15);
			assertEquals(2.0, instance.value(1), 1e-15);
			assertEquals(3.0, instance.value(2), 1e-15);
			assertEquals(4.0, instance.value(3), 1e-15);
		}
}