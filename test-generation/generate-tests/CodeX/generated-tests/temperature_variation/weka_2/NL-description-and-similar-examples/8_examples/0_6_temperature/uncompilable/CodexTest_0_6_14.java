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


public class CodexTest_0_6_14 { 
  @Test
    public void testToInstance() {
			AlgVector a = new AlgVector(new double[] {1, 2, 3});
			try {
				Instances instances = new Instances(new StringReader(
						"@relation test\n" + 
						"@attribute a numeric\n" + 
						"@attribute b numeric\n" + 
						"@attribute c numeric\n" + 
						"@data\n" + 
						"1, 2, 3\n" + 
						"4, 5, 6\n" + 
						"7, 8, 9"));
				instances.setClassIndex(2);
				Instances header = new Instances(instances, 0);
				Random random = new Random();
				Instance inst = a.getAsInstance(header, random);
				assertEquals(3, inst.numAttributes());
				assertEquals(1, inst.value(0), 0.001);
				assertEquals(2, inst.value(1), 0.001);
				assertEquals(3, inst.value(2), 0.001);
			} catch (Exception e) {
				fail(e.getMessage());
			}
		}
}