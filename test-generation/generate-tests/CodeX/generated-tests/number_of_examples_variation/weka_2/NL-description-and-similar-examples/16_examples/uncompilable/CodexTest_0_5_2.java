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


public class CodexTest_0_5_2 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 5;
    int numInsts = 10;
    double[] values = {1.0, 2.0, 3.0, 4.0, 5.0};
    Instances i = makeTestDataset(numAtts, numInsts);
    DenseInstance in = new DenseInstance(numAtts);
    in.setDataset(i);
    for (int j = 0; j < numAtts; j++) {
      in.setValue(j, values[j]);
    }
    DenseInstance in2 = (DenseInstance)in.getAsInstance(i, new Random());
    for (int j = 0; j < numAtts; j++) {
      if (i.attribute(j).isNominal()) {
	assertTrue("Nominal attribute should have been set", 
		   !Instance.isMissingValue(in2.value(j)));
      } else if (i.attribute(j).isNumeric()) {
	assertEquals("Numeric attribute not set correctly", values[j],
		     in2.value(j), 1e-6);
      }
    }
  }
}