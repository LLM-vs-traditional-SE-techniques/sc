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


public class CodexTest_0_9_57 { 
  @Test
  public void testInstances() throws Exception {
    Instances dataset = new Instances(new BufferedReader(new FileReader(testFile)));
    dataset.setClassIndex(1);
    double[] vec = { 0.2, 0.3 };
    AlgVector v = new AlgVector(vec);
    Instance newInst = v.getAsInstance(dataset, null);
    assertEquals(1, newInst.numClasses());
  }
}