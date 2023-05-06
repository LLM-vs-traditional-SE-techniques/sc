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


public class CodexTest_0_4_46 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" +
					"@attribute a numeric\n" +
					"@attribute b numeric\n" +
					"@attribute c numeric\n" +
					"@data\n" +
					"0,0,0\n" +
					"0,0,0\n" +
					"0,0,0\n" +
					"0,0,0\n")));
			Instance inst = v.getAsInstance(model, null);
			assertEquals(3, inst.numAttributes());
			assertEquals(2.3, inst.value(0), 1e-15);
			assertEquals(1.2, inst.value(1), 1e-15);
			assertEquals(5.0, inst.value(2), 1e-15);
		}
}