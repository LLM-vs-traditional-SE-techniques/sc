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


public class CodexTest_0_4_8 { 
  @Test
    public void testGetAsInstance() throws Exception {
			AlgVector vector = new AlgVector(new double[] { 1, 2, 3 });
			Instances dataset = new Instances(new BufferedReader(new StringReader(
					"@RELATION test\n" + "@ATTRIBUTE a NUMERIC\n" + "@ATTRIBUTE b NUMERIC\n"
							+ "@ATTRIBUTE c NUMERIC\n" + "@ATTRIBUTE d NUMERIC\n" + "@DATA\n" + "1,2,3,4\n"
							+ "5,6,7,8\n" + "9,10,11,12\n")));
			Random random = new Random(1);
			Instance result = vector.getAsInstance(dataset, random);
			assertEquals(1.0, result.value(0), 1e-6);
			assertEquals(2.0, result.value(1), 1e-6);
			assertEquals(3.0, result.value(2), 1e-6);
			assertEquals(0.0, result.value(3), 1e-6);
		}
}