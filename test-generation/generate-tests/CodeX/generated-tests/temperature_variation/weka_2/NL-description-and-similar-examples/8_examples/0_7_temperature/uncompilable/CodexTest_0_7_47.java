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


public class CodexTest_0_7_47 { 
  @Test
  /**
   * Tests the Instance getAsInstance(Instances model, Random random) method.
   */
  public void testGetAsInstance() {
    Instances model = new Instances(randData, 0);
    model.setClassIndex(randData.numAttributes()-1);
    Instance inst = null;
    AlgVector v = null;
    double[] data = null;
    try {
      inst = model.instance(0);
      v = new AlgVector(inst);
      data = v.getArrayRef();
      inst = v.getAsInstance(model, new Random(1));
      v = new AlgVector(inst);
    }
    catch (Exception ex) {
      fail("Error in getAsInstance");
    }
    for (int i = 0; i < data.length; i++) {
      assertTrue("Different values in getAsInstance", data[i] == inst.value(i));
    }
  }
}