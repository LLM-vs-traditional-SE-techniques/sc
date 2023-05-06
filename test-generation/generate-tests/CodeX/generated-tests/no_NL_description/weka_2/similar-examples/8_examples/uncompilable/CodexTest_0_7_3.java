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


public class CodexTest_0_7_3 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
		      "Name,age,height,weight,nom,nom2,str\n"
		    + "first,0,100,100,1,1,1\n")));
    data.setClassIndex(data.numAttributes() - 1);
    double[] means = {1.0,  1.0,  1.0};
    try {
      Instance inst = new DenseInstance(1.0, means);
      inst.setDataset(data);
      assertEquals("first,1.0,1.0,1.0,0.0,0.0,0.0", inst.toString());
      Instance newInst = inst.getAsInstance(data, new Random());
      assertEquals("first,1.0,1.0,1.0,1.0,1.0,0.0", newInst.toString());
    } catch (Exception ex) {
      fail("Exception: " + ex.getMessage());
    }
  }
}