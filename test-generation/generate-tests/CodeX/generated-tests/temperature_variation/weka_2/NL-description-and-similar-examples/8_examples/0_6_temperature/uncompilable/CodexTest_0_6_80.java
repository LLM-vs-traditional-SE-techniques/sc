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


public class CodexTest_0_6_80 { 
  @Test
    public void testGetAsInstance() {
		Instances inst = new Instances(new BufferedReader(new StringReader(
				"@relation test\n" + "@attribute a numeric\n" + "@attribute b numeric\n"
						+ "@attribute c numeric\n" + "@data\n" + "1,2,3\n" + "4,5,6\n")));
		AlgVector v = new AlgVector(new double[] { 1.0, 2.0, 3.0 });
		Instance inst2 = v.getAsInstance(inst, new Random(1));
		assertEquals(1, inst2.value(0), 0.0);
		assertEquals(2, inst2.value(1), 0.0);
		assertEquals(3, inst2.value(2), 0.0);
	}
}