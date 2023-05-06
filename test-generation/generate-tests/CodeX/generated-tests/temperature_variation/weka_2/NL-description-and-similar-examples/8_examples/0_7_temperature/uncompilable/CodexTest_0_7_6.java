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


public class CodexTest_0_7_6 { 
  @Test
  public void testGetAsInstance() {
    int num = 20;
    Random random = new Random(1);
    Instances inst = new Instances(new FastVector(), 0);
    inst.setClassIndex(num - 1);
    for (int i = 0; i < num; i++) {
      if (i == (num - 1)) {
	inst.insertAttributeAt(new Attribute("Nom" + i), i);
      } else {
	inst.insertAttributeAt(new Attribute("Num" + i), i);
      }
    }
    inst.insertAttributeAt(new Attribute("Nom" + num), num);
    double[] vals = new double[num];
    for (int i = 0; i < num; i++) {
      vals[i] = random.nextDouble();
    }
    AlgVector vec = new AlgVector(vals);
    try {
      Instance instNew = vec.getAsInstance(inst, random);
      assertEquals("Instance and Vector differ in length", 
		   instNew.numAttributes(), vals.length);
      for (int i = 0; i < vals.length; i++) {
	if (i == (vals.length - 1)) {
	  assertEquals("Nominal value differs", (int) vals[i], 
		       (int) instNew.value(i));
	} else {
	  assertEquals("Numeric value differs", vals[i], 
		       instNew.value(i), 1e-6);
	}
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception occured: " + ex.getMessage());
    }
  }
}