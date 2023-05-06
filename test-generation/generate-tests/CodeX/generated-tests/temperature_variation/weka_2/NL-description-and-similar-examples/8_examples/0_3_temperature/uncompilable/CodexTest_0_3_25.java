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


public class CodexTest_0_3_25 { 
  @Test
    public void testGetAsInstance() {
			AlgVector v = new AlgVector(new double[]{1, 2, 3});
			Instances model = new Instances(new StringReader("@RELATION test\n" +
					"@ATTRIBUTE a NUMERIC\n" +
					"@ATTRIBUTE b NUMERIC\n" +
					"@ATTRIBUTE c NUMERIC\n" +
					"@ATTRIBUTE d NUMERIC\n" +
					"@DATA\n" +
					"1,2,3,4\n" +
					"2,3,4,5\n" +
					"3,4,5,6\n"));
			Random random = new Random(1);
			Instance inst = v.getAsInstance(model, random);
			assertEquals("Wrong number of attributes", model.numAttributes(), inst.numAttributes());
			assertEquals("Wrong number of values", model.numAttributes(), inst.numValues());
			assertEquals("Wrong value", 1.0, inst.value(0), 1e-15);
			assertEquals("Wrong value", 2.0, inst.value(1), 1e-15);
			assertEquals("Wrong value", 3.0, inst.value(2), 1e-15);
			assertEquals("Wrong value", 0.0, inst.value(3), 1e-15);
		}
}