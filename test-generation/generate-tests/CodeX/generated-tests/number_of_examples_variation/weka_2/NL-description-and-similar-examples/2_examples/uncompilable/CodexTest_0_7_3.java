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
   public void testgetAsInstance() {
      try {
         Instances data = new Instances(m_Data, 0);
         
         AlgVector v = m_Alg.getAsVector(data.firstInstance());
         
         Instance inst = v.getAsInstance(data, m_Random);
         assertEquals("Datatype not equal", v.getAsInstance(data, m_Random).dataset(), data);
         
         //assertEquals("Datatype not equal", v.getAsInstance(data, m_Random).attribute(2).isNumeric(), false);
      }
      catch (Exception e) {
         fail("Exception occurred: " + e.getMessage());
      }
   }
}