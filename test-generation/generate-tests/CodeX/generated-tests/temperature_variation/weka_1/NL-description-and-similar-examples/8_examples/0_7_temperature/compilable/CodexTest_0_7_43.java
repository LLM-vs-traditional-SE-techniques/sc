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


public class CodexTest_0_7_43 { 
  @Test
    public void testAddVector() {
		int len = 22;
		AlgVector v = new AlgVector(len);
		AlgVector w = new AlgVector(len);
		for (int i = 0; i < len; i++) {
			v.setElement(i, i);
			w.setElement(i, i + 1);
		}
		AlgVector z = v.add(w);
		assertEquals("Length differs", len, z.numElements());
		for (int i = 0; i < len; i++)
			assertEquals((i + 1) + ". value differs", i * 2 + 1, z.getElement(i), 0.0);
	}

}