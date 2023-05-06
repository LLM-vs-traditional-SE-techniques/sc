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


public class CodexTest_0_5_60 { 
  @Test
	public void testGetAsInstance() throws Exception {
		AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
		Instance inst = v.getAsInstance(new Instances(null, new FastVector(3), 0), new Random(1));
		assertEquals(1.0, inst.value(0), 0.0);
		assertEquals(2.0, inst.value(1), 0.0);
		assertEquals(3.0, inst.value(2), 0.0);
	}
}