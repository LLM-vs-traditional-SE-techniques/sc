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


public class CodexTest_0_7_77 { 
  @Test
  public void testGetAsInstance() throws Exception {
    int numAtts = 0;
    int classIndex = 0;
    int numValues = 20;
    Random random = new Random(1);
    Instances model = new Instances(new BufferedReader(new StringReader(
      InstancesTest.dummyDataset(numAtts, classIndex, numValues))));
    AlgVector v = new AlgVector(new double[]{1.0, 2.0, 3.0});
    assertNotNull("Null instance", v.getAsInstance(model, random));
  }
}