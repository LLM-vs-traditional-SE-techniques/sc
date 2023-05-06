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


public class CodexTest_0_7_52 { 
  @Test
  public void testInstances() throws Exception {
    Instances data = new Instances(new BufferedReader(
				   new StringReader(
				       "A,B,C\n" +
				       "0,1,2\n" +
				       "0,2,3\n" +
				       "1,1,1\n" +
				       "0,2,1\n")));
    data.setClassIndex(2);
    AlgVector v1 = new AlgVector(data.numAttributes());
    AlgVector v2 = v1.getAsInstance(data, new Random(1));
    assertEquals("Number of attributes differs",
		 v1.numElements(), v2.numElements());
    for (int i = 0; i < v1.numElements(); i++)
      assertEquals(i + ". value differs", v1.getElement(i), v2.getElement(i));
  }
}