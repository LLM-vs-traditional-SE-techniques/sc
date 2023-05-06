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


public class CodexTest_0_7_4 { 
  @Test
  public void testGetAsInstance() {
    Instances data = new Instances(new BufferedReader(new StringReader(
								      "Attr1,Attr2,Attr3\n" +
								      "1,0,2\n" +
								      "1,1,4\n" +
								      "1,0,3\n" +
								      "2,2,5\n" +
								      "1,1,4\n" +
								      "1,1,4\n" +
								      "2,2,5\n" +
								      "2,2,5\n")));
    double[] v = {3, 5, 7};
    AlgVector alg = new AlgVector(v);
    try {
      Instance inst = alg.getAsInstance(data, null);
      assertTrue("Should be a sparse instance", inst instanceof SparseInstance);
      assertEquals("Should be 3 attributes", 3, inst.numAttributes());
      assertEquals("1st attribute should be 0", 0, inst.value(0));
      assertEquals("2nd attribute should be 1", 1, inst.value(1));
      assertEquals("3rd attribute should be 3", 3, inst.value(2));
    } catch (Exception ex) {
      fail();
    }
  }
}