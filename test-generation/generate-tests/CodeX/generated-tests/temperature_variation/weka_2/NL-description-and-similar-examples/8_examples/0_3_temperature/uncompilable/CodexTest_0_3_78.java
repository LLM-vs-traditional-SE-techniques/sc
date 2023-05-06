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


public class CodexTest_0_3_78 { 
  @Test
    public void testGetAsInstance() {
			AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
			Instances data = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" +
					"@attribute a numeric\n" +
					"@attribute b numeric\n" +
					"@attribute c numeric\n" +
					"@data\n" +
					"1.0,2.0,3.0\n" +
					"4.0,5.0,6.0\n" +
					"7.0,8.0,9.0\n"
					)));
			Instance inst = v.getAsInstance(data, new Random(1));
			assertEquals(v.numElements(), inst.numAttributes());
			assertEquals(1.0, inst.value(0), 1e-6);
			assertEquals(2.0, inst.value(1), 1e-6);
			assertEquals(3.0, inst.value(2), 1e-6);
		  }

}