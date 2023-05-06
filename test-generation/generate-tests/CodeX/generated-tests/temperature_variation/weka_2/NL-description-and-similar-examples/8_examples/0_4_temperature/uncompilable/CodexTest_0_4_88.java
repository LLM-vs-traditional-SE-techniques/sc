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


public class CodexTest_0_4_88 { 
  @Test
    
    
    
    
    
    public void testGetAsInstance() {
    int numAtt = 3;
    int numVal = 4;
    double[] values = {1.0, 2.0, 3.0, 4.0};
    Instances insts = new Instances("test", 
				    makeTestHeader(numAtt, numVal), 0);
    AlgVector v = new AlgVector(values);
    try {
      Instance inst = v.getAsInstance(insts, new Random(1));
      assertEquals("Number of attributes differ.", numAtt, inst.numAttributes());
      assertEquals("Number of values differ.", numVal, inst.numValues());
      for (int i = 0; i < numVal; i++) {
	assertEquals((i+1) + ". value differs.", values[i], inst.value(i));
      }
    } catch (Exception ex) {
      fail("Exception during testing: " + ex.getMessage());
    }
  }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}