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


public class CodexTest_0_4_43 { 
  @Test
    public void testGetAsInstance() {
		AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
		Instances data = new Instances(new BufferedReader(
			new StringReader(
				"@relation Test\n" + 
				"@attribute a numeric\n" +
				"@attribute b numeric\n" +
				"@attribute c numeric\n" +
				"@attribute d {0,1,2,3,4,5,6,7,8,9}\n" +
				"@data\n" +
				"1.0, 2.0, 3.0, 0\n"
			)
		));
		data.setClassIndex(data.numAttributes() - 1);
		Random random = new Random(1);
		Instance inst = v.getAsInstance(data, random);
		assertEquals("a", 1.0, inst.value(0));
		assertEquals("b", 2.0, inst.value(1));
		assertEquals("c", 3.0, inst.value(2));
		assertEquals("d", 0, inst.value(3));
	}
}