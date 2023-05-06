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


public class CodexTest_0_4_1 { 
  @Test
  public void testGetAsInstance() {
    try {
      Instances model = new Instances(new BufferedReader(new StringReader(
									 InstancesTest.irisDataset())));
      model.setClassIndex(model.numAttributes() - 1);
      double[] elements = {1, 2, 3, 4};
      AlgVector v = new AlgVector(elements);
      Instance inst = v.getAsInstance(model, new Random(1));
      assertEquals(model.numAttributes(), inst.numAttributes());
      assertEquals(model.numClasses(), inst.numClasses());
      assertEquals(model.classAttribute().value((int) inst.classValue()), 
		   model.classAttribute().value(0));
      assertEquals(1.0, inst.value(0), 0.01);
      assertEquals(2.0, inst.value(1), 0.01);
      assertEquals(3.0, inst.value(2), 0.01);
      assertEquals(4.0, inst.value(3), 0.01);
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown: " + ex.getMessage());
    }
  }
}