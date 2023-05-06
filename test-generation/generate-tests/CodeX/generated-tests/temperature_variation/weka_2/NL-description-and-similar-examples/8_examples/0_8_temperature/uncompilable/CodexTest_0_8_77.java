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


public class CodexTest_0_8_77 { 
  @Test
  public void testInitialize() {
    int numInstances = 20;
    Instances dataset = makeTestDataset(numInstances, 0);
    dataset.setClassIndex(dataset.numAttributes() - 1);
    try {
      AlgVector algVector = new AlgVector(numInstances);
      algVector.initialize(dataset);
      assertNotEquals("Empty vector", algVector.getAsInstance(dataset, new Random()), null);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}