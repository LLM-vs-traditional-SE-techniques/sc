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


public class CodexTest_0_8_36 { 
  @Test
    public void testGetAsInstance() {
    double[] data = { 2.3, 1.2, 5.0 };
    AlgVector v = new AlgVector(data);
    try {
      Instances dataset = new Instances(new BufferedReader(new StringReader(
          "Data,Class" + "\n" + "F,1" + "\n" + "F,2" + "\n" + "F,3" + "\n"
              + "F,4" + "\n" + "F,5" + "\n" + "F,6" + "\n" + "F,7" + "\n")));
      dataset.setClassIndex(1);
      Random rand = new Random(1);
      Instance inst = v.getAsInstance(dataset, rand);
      assertEquals(8, dataset.numAttributes());
      assertEquals(7, dataset.numClasses());
      assertEquals(2.3, inst.value(0), 0.00001);
      assertEquals(1.2, inst.value(1), 0.00001);
      assertEquals(5.0, inst.value(2), 0.00001);
      int lastIndex = dataset.numAttributes() - 1;
      assertTrue(inst.value(lastIndex) >= 0.0
          && inst.value(lastIndex) <= dataset.numClasses());
    } catch (Exception e) {
      fail("Exception caught: " + e);
    }
  }
}