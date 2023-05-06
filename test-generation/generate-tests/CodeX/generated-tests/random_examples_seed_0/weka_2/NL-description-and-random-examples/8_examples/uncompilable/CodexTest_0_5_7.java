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


public class CodexTest_0_5_7 { 
  @Test
    public void testGetAsInstance() {
    try {
      Instances inst = new Instances(new BufferedReader(new FileReader(TEST_DIR + "instances.arff")));
      inst.setClassIndex(1);
      DenseInstance instance = new DenseInstance(inst.numAttributes());
      for (int i = 0; i < instance.numAttributes(); i++) {
        Attribute att = inst.attribute(i);
        if (att.isNumeric())
          instance.setValue(i, 0);
        else if (att.isNominal())
          instance.setValue(i, att.value(0));
      }
      Instance inst2 = instance.getAsInstance(inst, new Random(1));
      assertEquals(inst2.toString(), instance.toString());
    } catch (Exception e) {
      fail("Problem with getAsInstance: " + e.toString());
    }
  }
}