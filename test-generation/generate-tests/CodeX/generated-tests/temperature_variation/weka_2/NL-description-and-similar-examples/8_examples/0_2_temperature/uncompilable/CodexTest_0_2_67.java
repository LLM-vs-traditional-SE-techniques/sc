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


public class CodexTest_0_2_67 { 
  @Test
    public void testGetAsInstance() {
			double[] data = {2.3, 1.2, 5.0};
			AlgVector v = new AlgVector(data);
			Instances model = new Instances(new BufferedReader(new StringReader(
					"@relation Test\n"
					+ "@attribute a numeric\n"
					+ "@attribute b numeric\n"
					+ "@attribute c numeric\n"
					+ "@data\n"
					+ "1,2,3\n"
					+ "4,5,6\n")));
			Random random = new Random(1);
			Instance newInst = v.getAsInstance(model, random);
			assertEquals(3, newInst.numAttributes());
			assertEquals(2.3, newInst.value(0), 1e-15);
			assertEquals(1.2, newInst.value(1), 1e-15);
			assertEquals(5.0, newInst.value(2), 1e-15);
		  }
}