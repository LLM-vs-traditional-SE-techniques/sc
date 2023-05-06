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


public class CodexTest_0_2_26 { 
  @Test
    public void testGetAsInstance() throws Exception {
			AlgVector v = new AlgVector(new double[] {1.0, 2.0, 3.0});
			Instances inst = new Instances(new StringReader(
					"@relation test\n" +
					"@attribute a numeric\n" +
					"@attribute b numeric\n" +
					"@attribute c numeric\n" +
					"@data\n" +
					"0,0,0\n" +
					"1,1,1\n" +
					"2,2,2\n" +
					"3,3,3\n"));
			Instance inst2 = v.getAsInstance(inst, new Random(1));
			assertEquals("a", 1.0, inst2.value(0));
			assertEquals("b", 2.0, inst2.value(1));
			assertEquals("c", 3.0, inst2.value(2));
		  }
}