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


public class CodexTest_0_6_7 { 
  @Test
    public void testGenerateInstance() {
			Instances instances = new Instances(new BufferedReader(new StringReader(
					"@relation test\n" + "\n" + "@attribute num numeric\n"
							+ "@attribute nominal {y,n}\n" + "\n" + "@data\n" + "1,y\n"
							+ "2,n\n" + "3,y\n")));
			instances.setClassIndex(1);
			AlgVector vector = new AlgVector(new double[] { 1, 2, 3 });
			// test with no class
			Instances noClass = new Instances(instances, 0);
			noClass.setClassIndex(-1);
			assertEquals(2, vector.getAsInstance(noClass, new Random(1)).numAttributes());
			// test with class
			assertEquals(3, vector.getAsInstance(instances, new Random(1)).numAttributes());
		}
}