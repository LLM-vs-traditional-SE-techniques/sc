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


public class CodexTest_0_5_100 { 
  @Test
    public void testGetAsInstanceRandom() throws Exception {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@RELATION test\n" +
					"@ATTRIBUTE a NUMERIC\n" +
					"@ATTRIBUTE b NUMERIC\n" +
					"@ATTRIBUTE c NUMERIC\n" +
					"@DATA\n" +
					"1.0, 2.0, 3.0\n" +
					"4.0, 5.0, 6.0\n" +
					"7.0, 8.0, 9.0\n")));
			Random random = new Random(1);
			Instance inst = v.getAsInstance(model, random);
			assertEquals(data[0], inst.value(0), 0.0);
			assertEquals(data[1], inst.value(1), 0.0);
			assertEquals(data[2], inst.value(2), 0.0);
		  }
}