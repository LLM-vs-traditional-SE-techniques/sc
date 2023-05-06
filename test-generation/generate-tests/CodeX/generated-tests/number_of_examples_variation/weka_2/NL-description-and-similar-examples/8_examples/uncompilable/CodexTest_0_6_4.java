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


public class CodexTest_0_6_4 { 
    @Test
	public void testGetAsInstance_WithDataset() {
		Instances data = new Instances(new BufferedReader(new StringReader(
				"@RELATION test\n" + "\n" + "@ATTRIBUTE A NUMERIC\n"
						+ "@ATTRIBUTE B NUMERIC\n" + "@ATTRIBUTE C NUMERIC\n"
						+ "@ATTRIBUTE D NUMERIC\n" + "@ATTRIBUTE E NUMERIC\n"
						+ "\n" + "@DATA\n" + "1,2,3,4,5\n" + "6,7,8,9,10\n")));
		AlgVector algVector = new AlgVector(new double[] { 1, 2, 3, 4, 5 });
		Instance instance = algVector.getAsInstance(data, new Random(1));
		assertEquals(algVector.getElement(0), instance.value(0), 0);
		assertEquals(algVector.getElement(1), instance.value(1), 0);
		assertEquals(algVector.getElement(2), instance.value(2), 0);
		assertEquals(algVector.getElement(3), instance.value(3), 0);
		assertEquals(algVector.getElement(4), instance.value(4), 0);
	}
}