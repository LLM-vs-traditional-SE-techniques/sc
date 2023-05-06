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


public class CodexTest_0_8_3 { 
  @Test
    public void testGetAsInstance() throws Exception {
		AlgVector v = new AlgVector(new double[] { 1.0, 2.0 });
		Instances data = v.getAsInstances();
		Instance inst = v.getAsInstance(data, new EasyMock.NiceMock<Random>());
		assertEquals("Num values differs", data.numAttributes(), inst.numValues());
		for (int i = 0; i < data.numAttributes(); i++) {
			if (data.attribute(i).isNominal()) {
				assertTrue("Nominal value missing", data.attribute(i).isInRange(inst.value(i)));
			} else {
				assertEquals(i + "val", data.attribute(i).value(((int) inst.value(i))),
						Double.toString(v.getElement(i)));
			}
		}
	}
**/
}