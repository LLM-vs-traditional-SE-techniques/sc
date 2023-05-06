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


public class CodexTest_0_6_5 { 
    @Test
	public void testGetAsInstance() {
		m_Elements = new double[] { 1.0, 2.0, 3.0 };
		try {
			Random random = new Random(1);
			Instances model = new Instances(new StringReader(IRIS_DATASET));
			Instance instance = getAsInstance(model, random);
			assertArrayEquals(new double[] { 1.0, 2.0, 3.0 }, instance.toDoubleArray(), 0.0);
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
}