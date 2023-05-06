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


public class CodexTest_0_8_68 { 
  @Test
  public void testGetAsInstance() {
    Instances test = new Instances(new BufferedReader(new StringReader(
									 InstancesTest.TEST_INSTANCES)));
    int num = test.numAttributes();
    for (int i = 0; i < num; i++) {
      test.deleteAttributeAt(0);
    }
    test.insertAttributeAt(new Attribute("Att1"), 0);
    test.insertAttributeAt(new Attribute("Att2", (FastVector) null), 1);
    test.insertAttributeAt(new Attribute("Att3"), 2);
    test.insertAttributeAt(new Attribute("Att4", (FastVector) null), 3);
    double [][] valueList = {{0,0,0},
			     {1,1,1},
			     {2,2,2},
			     {3,3,3}};
    for (int i = 0; i < valueList.length; i++) {
      double [] v = valueList[i];
      test.add(new DenseInstance(1.0, v));
    }
    AlgVector v = new AlgVector(test.instance(0));
    AlgVector v2 = new AlgVector(v.getAsInstance(test, new Random(0)));
    assertEquals("vectors should be equal", v, v2);
    AlgVector v3 = new AlgVector(4);
    for (int i = 0; i < 4; i++) {
      v3.setElement(i, i);
    }
    try {
      AlgVector v4 = new AlgVector(v3.getAsInstance(test, new Random(0)));
      assertEquals("vectors should be equal", v3, v4);
    } catch (Exception e) {
      fail("Exception: " + e.getMessage());
    }
  }
}