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


public class CodexTest_0_5_10 { 
    @Test
	public void testGetAsInstance() throws Exception {
		Instances model = new Instances(new BufferedReader(new StringReader(
				"@relation TestInstances\n" + "@attribute x numeric\n"
						+ "@attribute y numeric\n" + "@attribute z numeric\n"
						+ "@attribute class {a,b}\n" + "@data\n" + "1,2,3,a\n"
						+ "2,3,4,b\n")));
		model.setClassIndex(3);
		double[] d = new double[] { 1, 2, 3, 4 };
		DenseInstance instance = new DenseInstance(d);
		instance.setDataset(model);
		Random r = new Random(1);
		Instance newInst = instance.getAsInstance(model, r);
		assertTrue("Instance not equal", instance.equals(newInst));
	}
}