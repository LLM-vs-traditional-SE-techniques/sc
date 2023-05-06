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


public class CodexTest_0_4_28 { 
  @Test
  public void testGetAsInstance() {
    int numAtts = 3;
    int numInstances = 1;
    Instances data = new Instances(new BufferedReader(new StringReader(
								       "1,2,3\n4,5,6")));
    data.setClassIndex(data.numAttributes() - 1);
    AlgVector test = new AlgVector(numAtts);
    test.setElement(0, 1);
    test.setElement(1, 2);
    test.setElement(2, 3);
    try {
      Instance inst = test.getAsInstance(data, new Random(1));
      assertTrue("Should be 1st instance", inst.equalHeaders(data.instance(0)));
      assertTrue("Should be 1st instance", inst.equalHeaders(data.instance(0)));
      assertTrue("Should be 1st instance", inst.equalHeaders(data.instance(0)));
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("Exception thrown on getAsInstance");
    }
  }
}