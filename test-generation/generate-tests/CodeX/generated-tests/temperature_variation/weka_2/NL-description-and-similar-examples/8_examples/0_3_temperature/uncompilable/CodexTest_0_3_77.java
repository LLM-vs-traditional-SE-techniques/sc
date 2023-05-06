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


public class CodexTest_0_3_77 { 
  @Test
    public void testGetAsInstance() {
			Instances data = new Instances(new BufferedReader(new StringReader(
					"@relation TestInstances\n" + "@attribute A numeric\n"
							+ "@attribute B numeric\n" + "@attribute C numeric\n"
							+ "@attribute D numeric\n" + "@attribute E numeric\n"
							+ "@attribute F numeric\n" + "@attribute G numeric\n"
							+ "@attribute H numeric\n" + "@attribute I numeric\n"
							+ "@attribute J numeric\n" + "@attribute K numeric\n"
							+ "@attribute L numeric\n" + "@attribute M numeric\n"
							+ "@attribute N numeric\n" + "@attribute O numeric\n"
							+ "@attribute P numeric\n" + "@attribute Q numeric\n"
							+ "@attribute R numeric\n" + "@attribute S numeric\n"
							+ "@attribute T numeric\n" + "@attribute U numeric\n"
							+ "@attribute V numeric\n" + "@attribute W numeric\n"
							+ "@attribute X numeric\n" + "@attribute Y numeric\n"
							+ "@attribute Z numeric\n" + "@data\n" + "1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26\n")));
			AlgVector v = new AlgVector(data.instance(0));
			Instance newInst = v.getAsInstance(data, new Random(1));
			assertEquals("Number of attributes differ", data.numAttributes(), newInst
					.numAttributes());
			assertEquals
}