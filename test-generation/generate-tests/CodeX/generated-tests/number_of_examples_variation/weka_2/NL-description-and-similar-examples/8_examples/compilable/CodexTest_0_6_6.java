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


public class CodexTest_0_6_6 { 
  @Test
    public void testGetAsInstance() {
		double[] data = { 2.3, 1.2, 5.0 };
		AlgVector v = new AlgVector(data);
		Random random = new Random(1);
		try {
			Instance inst = v.getAsInstance(null, random);
			assertEquals(1.2, inst.value(1), 1e-15);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}