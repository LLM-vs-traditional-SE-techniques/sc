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


public class CodexTest_0_9_73 { 
  	@Test
	public void testAdd() {
		double[] data = { 2.3, 2.3, 2.3 };
		AlgVector v1 = new AlgVector(data);
		AlgVector v2 = new AlgVector(data);
		AlgVector res = v1.add(v2);
		for (int i = 0; i < data.length; i++)
			assertEquals("[" + i + "] differs", data[i] * 2, res.getElement(i), 1e-6);
	}
}