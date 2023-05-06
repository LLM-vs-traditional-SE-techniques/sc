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


public class CodexTest_0_8_2 { 
  @Test
 	public void testAdd() {
      double[] v = {1.0,0.0,-1.0, 0.0, 2.0};
      AlgVector v1 = new AlgVector(v);
      AlgVector v2 = new AlgVector(v);
      
      double[] expected = {2.0,0.0,-2.0, 0.0, 4.0};
      AlgVector expectedV = new AlgVector(expected);
      
      AlgVector result = v1.add(v2);
      
      assertEquals(expectedV, result);
  }

}