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


public class CodexTest_0_6_66 { 
  @Test
  public void testGetAsInstance() {
    try {
      int numAtts = 10;
      int numVals = 10;
      Random random = new Random();
      FastVector atts = new FastVector();
      for (int i = 0; i < numAtts; i++) {
	if (i % 2 == 0) {
	  atts.addElement(new Attribute("Nom", (FastVector) null));
	} else {
	  atts.addElement(new Attribute("Num"));
	}
      }
      Instances model = new Instances("Test", atts, 0);
      double[] data = new double[numAtts];
      for (int i = 0; i < data.length; i++) {
	if (i % 2 == 0) {
	  data[i] = random.nextInt(numVals);
	} else {
	  data[i] = random.nextDouble();
	}
      }
      double[] copy = new double[data.length];
      System.arraycopy(data, 0, copy, 0, data.length);
      Instance orig = new DenseInstance(1.0, data);
      Instance test = orig.getAsInstance(model, random);
      for (int i = 0; i < test.numAttributes(); i++) {
	if (i % 2 == 0) {
	  assertEquals("Nominal index differs", copy[i], 
		       test.value(i), 0);
	} else {
	  assertEquals("Numeric values differ", copy[i], 
		       test.value(i), 0);
	}
      }
    } catch (Exception e) {
      fail("Problem applying getAsInstance: " + e);
    }
  }
}