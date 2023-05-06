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


public class CodexTest_0_6_18 { 
  @Test
    public void testGetAsInstance() {
    int numAtt = 4;
    Instances insts = new Instances("test", new ArrayList<Attribute>(), numAtt);
    insts.setClassIndex(numAtt - 1);
    for (int i = 0; i < numAtt; i++) {
      Attribute att = null;
      if (i < numAtt - 1)
	att = new Attribute("att" + i);
      else
	att = new Attribute("class", new ArrayList<String>());
      insts.insertAttributeAt(att, i);
    }
    double[] d = {1, 2, 3};
    AlgVector v = new AlgVector(d);
    try {
      Instance inst = v.getAsInstance(insts, new Random(0));
      assertEquals("Wrong number of attributes", numAtt, inst.numAttributes());
      assertEquals("Wrong number of values", numAtt, inst.numValues());
      for (int i = 0; i < d.length; i++)
	assertEquals("Wrong value at " + i, d[i], inst.value(i));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}