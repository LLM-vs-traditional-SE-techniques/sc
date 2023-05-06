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


public class CodexTest_0_3_2 { 
  @Test
  public void testGetAsInstance() {
    Instances model = new Instances(new BufferedReader(new StringReader(
								       "Id,Class\n"
								       + "1,1\n"
								       + "2,0\n"
								       + "3,1\n"
								       + "4,0\n"
								       + "5,1\n"
								       + "6,0\n"
								       + "7,1\n"
								       + "8,0\n"
								       + "9,1\n"
								       + "10,0\n")));
    model.setClassIndex(model.numAttributes() - 1);
    AlgVector v = new AlgVector(model.numAttributes());
    Random r = new Random(1);
    try {
      Instance inst = v.getAsInstance(model, r);
      assertTrue(inst.classValue() == 0.0);
    } catch (Exception e) {
      fail("Exception occurred: " + e.getMessage());
    }
  }
}