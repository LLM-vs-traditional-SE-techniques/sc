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


public class CodexTest_0_2_1 { 
  @Test
  public void testGetAsInstance() {
    int numAttributes = 3;
    int numInstances = 2;
    int numNumeric = 2;
    int numNominal = 1;
    int numValues = 2;
    Instances model = new Instances("test", new ArrayList<Attribute>(), numInstances);
    for (int i = 0; i < numAttributes; i++) {
      if (i < numNumeric) {
	model.insertAttributeAt(new Attribute("numeric" + i), i);
      } else {
	model.insertAttributeAt(new Attribute("nominal" + i, Arrays.asList("0", "1")), i);
      }
    }
    model.setClassIndex(numNumeric);
    double[] data = {1.0, 2.0};
    AlgVector v = new AlgVector(data);
    try {
      Instance newInst = v.getAsInstance(model, new Random(1));
      assertEquals("Wrong number of attributes", numAttributes, newInst.numAttributes());
      assertEquals("Wrong number of values", numNumeric, newInst.numValues());
      assertEquals("Wrong number of missing values", numNominal, newInst.numMissingValues());
      assertEquals("Wrong value", data[0], newInst.value(0), 1e-15);
      assertEquals("Wrong value", data[1], newInst.value(1), 1e-15);
      assertEquals("Wrong value", 0, newInst.value(2), 1e-15);
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}