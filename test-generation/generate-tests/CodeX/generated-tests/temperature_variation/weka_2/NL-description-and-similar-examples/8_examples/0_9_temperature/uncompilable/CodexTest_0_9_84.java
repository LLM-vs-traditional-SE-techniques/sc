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


public class CodexTest_0_9_84 { 
  @Test
    public void testGetAsInstance() throws Exception {
		double[] data = {2.3, 1.2, 5.0};
		AlgVector v = new AlgVector(data);
		Instances dataset = new Instances(new StringReader(
				"@relation Test\n" + "@attribute A numeric\n" + "@attribute B numeric\n" + "@attribute C numeric\n"
						+ "@data\n" + "1.0,2.0,3.0\n" + "2.0,3.0,4.0\n" + "3.0,4.0,5.0\n"));
		Instance instance = v.getAsInstance(dataset, new Random());
		assertEquals(2.3, instance.value(0), 1e-7);
		assertEquals(1.2, instance.value(1), 1e-7);
		assertEquals(5.0, instance.value(2), 1e-7);
	}

}