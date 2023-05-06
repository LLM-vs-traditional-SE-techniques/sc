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


public class CodexTest_0_7_5 { 
  @Test
   public void testGetAsInstance() {
     Instances inst = new Instances(new BufferedReader(new StringReader(
									 m_Instances.toString())));
     Instance instCopy = null;
     try {
       instCopy = getAsInstance(inst, new Random(1));
     } 
     catch (Exception e) {
       fail("Problem converting to instance: " + e.toString());
     }
     
     assertTrue(instCopy.equalHeaders(m_Instances));
     assertTrue(instCopy.equalHeaders(inst));
     
     double[][] values = new double[NUM_INSTANCES][NUM_ATTRIBUTES];
     for (int i = 0; i < NUM_INSTANCES; i++) {
       for (int n = 0; n < NUM_ATTRIBUTES; n++) {
	 values[i][n] = m_Instances.get(i).value(n);
       }
     }
     
     for (int i = 0; i < NUM_INSTANCES; i++) {
       for (int n = 0; n < NUM_ATTRIBUTES; n++) {
	 if (inst.attribute(n).isNumeric()) {
	   assertTrue(values[i][n] == instCopy.value(n));
	 }
       }
     }
   }
}