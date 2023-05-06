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


public class CodexTest_0_5_47 { 
  @Test
  public void testGetAsInstance() {
    int num = 10;
    int numAtt = 3;
    Random rand = new Random(1);
    AlgVector v = new AlgVector(num);
    for (int i = 0; i < num; i++)
      v.setElement(i, rand.nextDouble());
    Instances insts = new Instances(new Instances(m_Instances, 0), numAtt);
    for (int i = 0; i < numAtt; i++)
      insts.add(new Attribute("att" + (i + 1)));
    try {
      Instance inst = v.getAsInstance(insts, rand);
      assertEquals("Number of values differs", numAtt, inst.numValues());
      for (int i = 0; i < numAtt; i++) {
	if (insts.attribute(i).isNumeric()) {
	  assertEquals("Value differs for attribute " + i,
		       v.getElement(i), inst.value(i));
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception: " + ex.getMessage());
    }
  }
}