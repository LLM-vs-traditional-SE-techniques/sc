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


public class CodexTest_0_5_38 { 
  @Test
  public void testGetAsInstance() {
    try {
      int dims = 3;
      AlgVector v = new AlgVector(dims);
      for (int i = 0; i < dims; i++)
	v.setElement(i, i);
      Instances model = new Instances(new StringReader(
						       "Name, x, y\n" +
						       "A, 1, 0\n" +
						       "B, 0, 1\n" +
						       "C, 1, 1\n"));
      model.setClassIndex(model.numAttributes() - 1);
      Random random = new Random(0);
      Instance newInst = v.getAsInstance(model, random);
      assertEquals("Length differs", dims, v.numElements());
      assertEquals("Instance differs", 0.0, newInst.value(0));
      assertEquals("Instance differs", 1.0, newInst.value(1));
      assertEquals("Instance differs", 0.0, newInst.value(2));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception occurred: " + ex.getMessage());
    }
  }
}