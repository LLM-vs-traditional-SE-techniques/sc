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


public class CodexTest_0_8_10 { 
  @Test
  public void testDenseInstance() throws Exception {
		AlgVector v = new AlgVector(3);
		int numAtts = 10;
		int numVals = 5;
		ArrayList<Attribute> atts = new ArrayList<>(numAtts);
		for (int i = 0; i < numAtts; i++)
		  if (i % 2 == 0) {
			ArrayList<String> vals = new ArrayList<>(numVals);
			for (int n = 0; n < numVals; n++)
			  vals.add("val" + n);
			atts.add(new Attribute("att" + i, vals));
		  } else
			atts.add(new Attribute("att" + i));
		Instances i = new Instances("test", atts, 0);
		Instances i2 = new Instances("test2", atts, 0);
		Instance inst1 = v.getAsInstance(i, null);
		Instance inst2 = v.getAsInstance(i2, null);
		assertEquals("Dataset has changed", i.equalHeaders(i2), false);
		assertEquals("Instance has changed", inst1.equalHeaders(inst2), false);
	  }
}