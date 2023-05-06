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
    public void testGetAsInstance() {
		try {
			AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
			Instances d = new Instances(new BufferedReader(new StringReader(
					"@RELATION test\n" +
					"@ATTRIBUTE attr1 NUMERIC\n" +
					"@ATTRIBUTE attr2 NUMERIC\n" +
					"@ATTRIBUTE attr3 NUMERIC\n" +
					"@ATTRIBUTE attr4 NUMERIC\n" +
					"@ATTRIBUTE attr5 NUMERIC\n" +
					"@ATTRIBUTE attr6 NUMERIC\n" +
					"@ATTRIBUTE attr7 NUMERIC\n" +
					"@ATTRIBUTE class {0,1}\n" +
					"@DATA\n")));
			Instance inst = v.getAsInstance(d, new Random(1));
			assertEquals(7, inst.numAttributes());
			assertEquals(1.0, inst.value(0), 0.0);
			assertEquals(2.0, inst.value(1), 0.0);
			assertEquals(3.0, inst.value(2), 0.0);
			assertEquals(0.0, inst.value(3), 0.0);
			assertEquals(0.0, inst.value(4), 0.0);
			assertEquals(0.0, inst.value(5), 0.0);
			assertEquals(0.0, inst.value(6), 0.0);
		} catch (Exception e) {
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
}