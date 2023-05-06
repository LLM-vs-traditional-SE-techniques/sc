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


public class CodexTest_0_2_3 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int numAttributes = 3;
    int numInstances = 2;
    int numNumeric = 2;
    int numNominal = 1;
    int numValues = 3;
    Instances model = new Instances("Test", new ArrayList<Attribute>(), numInstances);
    for (int i = 0; i < numAttributes; i++) {
      if (i < numNumeric) {
	model.insertAttributeAt(new Attribute("Numeric" + i), i);
      } else {
	model.insertAttributeAt(new Attribute("Nominal" + i, Arrays.asList("A", "B", "C")), i);
      }
    }
    model.setClassIndex(numAttributes - 1);
    AlgVector v = new AlgVector(numNumeric);
    for (int i = 0; i < numNumeric; i++) {
      v.setElement(i, i);
    }
    Instance newInst = v.getAsInstance(model, new Random(1));
    assertEquals("Wrong number of attributes", numAttributes, newInst.numAttributes());
    for (int i = 0; i < numNumeric; i++) {
      assertEquals("Wrong value for numeric attribute", i, newInst.value(i), 0.0);
    }
    for (int i = numNumeric; i < numAttributes; i++) {
      assertEquals("Wrong value for nominal attribute", 1, newInst.value(i), 0.0);
    }
  }
}