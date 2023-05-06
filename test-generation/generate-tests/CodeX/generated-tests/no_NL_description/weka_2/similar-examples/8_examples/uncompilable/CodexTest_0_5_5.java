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


public class CodexTest_0_5_5 { 
  @Test
  public void testGetAsInstance() {
    int n = 4;
    int m = 10;
    double[] data = new double[n];
    for (int i = 0; i < n; i++) {
      data[i] = i;
    }
    AlgVector v = new AlgVector(data);
    Instances model = new Instances(new StringReader(
						      "nom,num\n" +
						      "nom,num,nom,num\n" +
						      "0,1,2,3"));
    model.setClassIndex(model.numAttributes() - 1);
    Random random = new Random(1);
    for (int i = 0; i < m; i++) {
      Instance inst = v.getAsInstance(model, random);
      assertEquals("Wrong number of attributes", model.numAttributes() - 1,
		   inst.numAttributes());
      assertEquals("Wrong number of values", n, inst.numValues());
      for (int j = 0; j < n; j++) {
	assertEquals("Wrong value at position " + j, data[j], inst.value(j));
      }
    }
  }
}