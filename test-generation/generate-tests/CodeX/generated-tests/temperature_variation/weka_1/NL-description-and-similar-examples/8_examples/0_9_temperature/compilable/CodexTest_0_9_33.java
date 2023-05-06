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


public class CodexTest_0_9_33 { 
  @Test
  public void testAdd() 
  throws Exception {
     double[] data1 = {2.3, 1.2, 5.0, 1.0};
     AlgVector vector1 = new AlgVector(data1);
     double[] data2 = {3.3, 2.2, 6.0, 0.6};
     AlgVector vector2 = new AlgVector(data2);
     AlgVector vector3 = (AlgVector)vector1.add(vector2);
     for (int i = 0; i < data1.length; i++) {
       assertEquals((i+1) + "th value differs", data1[i] + data2[i], 
		    vector3.getElement(i), 1e-20);
       }
   }
}