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


public class CodexTest_0_9_50 { 
  @Test
    public void testInstanceGetAsInstance() {
    int [] attribs = {2,3,1,3,3};
    int i;
    boolean invalid = true;
    Instances resInst = null;
    try {
      // first check with numeric attributes
      resInst = createTestAttributes(attribs);
      resInst.setClassIndex(1);
      AlgVector av = new AlgVector(new double []{1, 2, 3});
      Instance res = av.getAsInstance(resInst, new Random(0));
      if (res.classIndex() != 1) {
        System.out.println(res);
        throw new Exception("Class index is not 1.");
      }
      if (res.stringValue(0) != "")
        invalid = false;
      for (i=0; i < 3; i++) {
        if (res.value(i+1) != (double)(i + 1))
          invalid = false;
      }
      for (; i < 5; i++)
        if (res.stringValue(i+1) != "")
          invalid = false;
      if (invalid)
        throw new Exception("Result is not what we expect.");
      resInst.setClassIndex(3);
      res = av.getAsInstance(resInst, new Random(1));
      if (res.classIndex() != 3) {
        System.out.println(res);
        throw new Exception("Class index is not 3.");
      }
    } catch (Exception ex) {
      ex.printStackTrace();
      fail("testInstanceGetAsInstance: " + ex.getMessage());
    }
  }
}