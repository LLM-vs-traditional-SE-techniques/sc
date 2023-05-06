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


public class CodexTest_0_6_59 { 
  @Test
    public void testGetAsInstance() throws Exception {
			double[] data = {1.0, 2.0, 3.0};
			AlgVector v = new AlgVector(data);
			Instances insts = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" +
							"@attribute a numeric\n" +
							"@attribute b numeric\n" +
							"@attribute c numeric\n" +
							"@data\n" +
							"0,1,2\n" +
							"3,4,5\n" +
							"6,7,8\n" +
							"9,10,11\n"
			)));
			Instance newInst = v.getAsInstance(insts, new Random(1));
			assertEquals("Number of attributes differ", insts.numAttributes(), newInst.numAttributes());
			assertEquals("Number of values differs", insts.numAttributes(), v.numElements());
			assertEquals("Value differs", 1.0, newInst.value(0));
			assertEquals("Value differs", 2.0, newInst.value(1));
			assertEquals("Value differs", 3.0, newInst.value(2));
			assertEquals("Value differs", 2, newInst.value(3));
			assertEquals("Value differs", 1, newInst.value(4));
		}
}