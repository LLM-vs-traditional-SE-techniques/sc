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


public class CodexTest_0_7_100 { 
  @Test
  public void testGetAsInstance() {
    double[][] data = new double[2][2];
    data[0][0] = 1.0; data[0][1] = 2.0;
    data[1][0] = 3.0; data[1][1] = 4.0;
    Matrix A = new Matrix(data);
    try {
      Instances inst = new Instances(new StringReader(""));
      double[] indata = {1.0, 2.0, 3.0, 4.0};
      AlgVector vec = new AlgVector(indata);
      assertEquals("vec.getAsInstance(inst, new Random()).toString()", 
		   "1.0,2.0,3.0,4.0", vec.getAsInstance(inst, new Random()).toString());
    } catch (Exception ex) {
      assertEquals("vec.getAsInstance(inst, new Random()).toString()", 
		   "Exception", ex.getMessage());
    }
  }
}