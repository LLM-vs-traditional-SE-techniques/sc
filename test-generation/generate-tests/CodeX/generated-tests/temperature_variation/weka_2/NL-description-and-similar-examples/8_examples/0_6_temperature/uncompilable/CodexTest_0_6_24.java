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


public class CodexTest_0_6_24 { 
  @Test
    public void testGetAsInstance() throws Exception {
		double[] data1 = { 2.3, 1.2, 5.0 };
		double[] data2 = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0 };
		AlgVector v1 = new AlgVector(data1);
		AlgVector v2 = new AlgVector(data2);
		Instances instance = new Instances(new StringReader(
				"@RELATION Test\n" + "@ATTRIBUTE attr1 NUMERIC\n"
						+ "@ATTRIBUTE attr2 NUMERIC\n"
						+ "@ATTRIBUTE attr3 NUMERIC\n"
						+ "@ATTRIBUTE attr4 NUMERIC\n"
						+ "@ATTRIBUTE attr5 NUMERIC\n"
						+ "@ATTRIBUTE attr6 NUMERIC\n"
						+ "@ATTRIBUTE attr7 NUMERIC\n"
						+ "@ATTRIBUTE attr8 NUMERIC\n"
						+ "@ATTRIBUTE attr9 NUMERIC\n"
						+ "@ATTRIBUTE attr10 NUMERIC\n"
						+ "@ATTRIBUTE class {1,2}\n" + "@DATA\n" + "1,2,3,4,5,6,7,8,9,10,1\n"));
		Random rand = new Random(1);
		Instance inst1 = v1.getAsInstance(instance, rand);
		assertEquals(2.3, inst1.value(0));
		assertEquals(1.2, inst1.value(1));
		assertEquals(5.0, inst1.value(2));
		assertEqu
}