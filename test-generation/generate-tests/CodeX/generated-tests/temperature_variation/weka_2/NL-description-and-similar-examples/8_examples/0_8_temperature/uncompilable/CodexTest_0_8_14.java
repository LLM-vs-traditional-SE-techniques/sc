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


public class CodexTest_0_8_14 { 
  @Test
   public void testRandomSelection() throws Exception {
    int numElems = 40;
    int numAtts = 30;
    Instances data = makeRandomDataset(numElems, 0, 10, numAtts, n, n, false);
    data.setClassIndex(data.numAttributes() - 1);
    data.deleteWithMissingClass();
    AlgVector startPoint = new AlgVector(data);
    Random random = new Random(1);
    Instance newInst = startPoint.getAsInstance(data, random);
    assertEquals("Number of attributes is wrong", data.numAttributes(), newInst.numAttributes());
    assertEquals("Number of values is wrong", data.numAttributes(), newInst.numValues());
  }
}