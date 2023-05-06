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


public class CodexTest_0_5_2 { 
  @Test
   public void testGetAsInstance() throws Exception {
    Instances data = new Instances(new BufferedReader(new StringReader(
								      "a,b,c\n1,1.1,1\n2,2.2,2\n3,3.3,3\n4,4.4,4\n5,5.5,5\n6,6.6,6\n7,7.7,7\n8,8.8,8\n9,9.9,9\n10,10.10,10")));
    data.setClassIndex(data.numAttributes() - 1);
    AlgVector v = new AlgVector(new double[]{1.1,2.2,3.3});
    Instance i = v.getAsInstance(data, new Random(1));
    assertEquals("Number of attributes differ", data.numAttributes(), 
		 i.numAttributes());
    assertEquals("1. attribute differs", 1, i.value(0));
    assertEquals("2. attribute differs", 1.1, i.value(1), 0.1);
    assertEquals("3. attribute differs", 1, i.value(2));
  }
}