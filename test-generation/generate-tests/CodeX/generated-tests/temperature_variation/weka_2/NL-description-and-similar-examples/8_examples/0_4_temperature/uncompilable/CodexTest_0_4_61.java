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


public class CodexTest_0_4_61 { 
  @Test
    public void testGetAsInstance() {
    int numAtt = 4;
    int numVal = 3;
    double[] values = {1.1, 2.2, 3.3};
    Instances dataset = new Instances("test", new ArrayList<Attribute>(), numAtt);
    for (int i = 0; i < numAtt; i++) {
      List<String> vals = new ArrayList<String>();
      for (int n = 0; n < numVal; n++) {
	vals.add("val" + (n + 1));
      }
      dataset.insertAttributeAt(new Attribute("att" + (i + 1), vals), i);
    }
    dataset.setClassIndex(dataset.numAttributes() - 1);
    AlgVector v = new AlgVector(values);
    try {
      Instance inst = v.getAsInstance(dataset, new Random(1));
      assertEquals(numAtt, inst.numAttributes());
      assertEquals(values[0], inst.value(0), 1e-6);
      assertEquals(values[1], inst.value(1), 1e-6);
      assertEquals(values[2], inst.value(2), 1e-6);
      assertEquals(numVal - 1, inst.value(3));
    } catch (Exception e) {
      fail("Exception thrown: " + e.getMessage());
    }
  }
}