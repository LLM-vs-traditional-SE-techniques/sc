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


public class CodexTest_0_9_3 { 
  @Test
  public void testClassIsNominal() {
      Instances data = createTestDataset();  //uses createClass
      data.setClassIndex(data.numAttributes() - 1);
      AbstractWeightedInstancesMetaData meta = new 
            AbstractWeightedInstancesMetaData(data);
      assertTrue(meta.classIsNominal());
    }
}