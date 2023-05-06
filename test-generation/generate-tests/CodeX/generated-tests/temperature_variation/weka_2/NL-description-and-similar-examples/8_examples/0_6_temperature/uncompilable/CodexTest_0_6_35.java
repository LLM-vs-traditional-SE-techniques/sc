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


public class CodexTest_0_6_35 { 
  @Test
  public void testGetAsInstance() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    Instances inst = new Instances(new StringReader(
						    "nom,num\n"+
						    "1,1.0\n"+
						    "2,2.0\n"+
						    "3,3.0\n"+
						    "4,4.0\n"+
						    "5,5.0\n"+
						    "6,6.0\n"));
    inst.setClassIndex(1);
    try {
      Instance inst2 = v.getAsInstance(inst, new Random(1));
      assertEquals("Numeric value differs", data[0], inst2.value(0));
      assertEquals("Nominal value differs", 2, inst2.value(1));
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}