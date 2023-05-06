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


public class CodexTest_0_5_90 { 
  @Test
    public void testGetAsInstance() throws Exception {
			AlgVector v = new AlgVector(new double[] { 1, 2, 3, 4 });
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation TestInstances\n" + "@attribute A numeric\n"
							+ "@attribute B numeric\n"
							+ "@attribute C numeric\n"
							+ "@attribute D numeric\n" + "@data\n")), 0);
			Random r = new Random(0);
			Instance newInst = v.getAsInstance(model, r);
			assertEquals("A", 1, newInst.value(0), 1e-6);
			assertEquals("B", 2, newInst.value(1), 1e-6);
			assertEquals("C", 3, newInst.value(2), 1e-6);
			assertEquals("D", 4, newInst.value(3), 1e-6);
		}
}