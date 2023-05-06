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


public class CodexTest_0_7_7 { 
  @Test
   public void testGetAsInstanceNominalAttribute() {
			// given
			double[] data = { 1, 2, 3 };
			AlgVector vector = new AlgVector(data);
			Instances model = createInstancesWithNominalAttribute();
			// when
			Instance instance = vector.getAsInstance(model, new Random(1));
			// then
			assertEquals(-0.5, instance.value(0), 0.00001);
			assertEquals(0.0, instance.value(1), 0.00001);
			assertEquals(1.0, instance.value(2), 0.00001);
			assertEquals(0.0, instance.value(3), 0.00001);
		}
}