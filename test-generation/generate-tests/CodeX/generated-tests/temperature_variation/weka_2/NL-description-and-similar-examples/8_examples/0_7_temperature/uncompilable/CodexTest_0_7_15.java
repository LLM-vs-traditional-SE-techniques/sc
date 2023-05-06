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


public class CodexTest_0_7_15 { 
  @Test
	public void testGetAsInstance() throws Exception {
		AlgVector v = new AlgVector(new double[] { 1, 2, 3 });
		Random rnd = new Random(1);
		Instances model = new Instances(new StringReader(
				"@relation algvector\n" + "@attribute a numeric\n"
						+ "@attribute b numeric\n" + "@attribute c numeric\n"
						+ "@attribute d {a,b,c}\n" + "@attribute e {a,b,c}\n"
						+ "@data\n" + "0,0,0,a,a"));
		Instance i = v.getAsInstance(model, rnd);
		assertEquals(1, i.value(0), 0);
		assertEquals(2, i.value(1), 0);
		assertEquals(3, i.value(2), 0);
		assertEquals(1, i.value(3), 0);
		assertEquals(1, i.value(4), 0);
	}
}