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


public class CodexTest_0_5_80 { 
  @Test
    public void testGetAsInstance() {
		Instances d = new Instances(new BufferedReader(new StringReader(data)));
		Random r = new Random(1);
		Instance i = new DenseInstance(d.numAttributes());
		i.setDataset(d);
		AlgVector v = new AlgVector(i);
		Instance n = v.getAsInstance(d, r);
		assertEquals("Number of attributes differs", i.numAttributes(), n.numAttributes());
		assertEquals("Number of classes differs", i.classIndex(), n.classIndex());
		for (int j = 0; j < i.numAttributes(); j++) {
		  if (i.attribute(j).isNominal())
			assertEquals((j+1) + ". attribute differs", i.value(j), n.value(j));
		  if (i.attribute(j).isNumeric())
			assertEquals((j+1) + ". attribute differs", i.value(j), n.value(j), 1e-6);
		}
	  }
}