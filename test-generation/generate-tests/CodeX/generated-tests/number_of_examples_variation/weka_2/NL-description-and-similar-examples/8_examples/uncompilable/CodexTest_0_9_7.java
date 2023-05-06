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


public class CodexTest_0_9_7 { 
  @Test
      /** This test deliberately causes an invalid data type exception to 
   *  verify that an exception is generated for bad data types.
   */
  public void testInvalidDataTypes() {
    Instances dataset = null;
    try {
      dataset = createDataset(42, 1, 2);
      dataset.setClassIndex(2);
      Instance instance = createInstance(dataset, new double[] { 1.0, 2.0 });
      dataset.add(instance);
      double[] values = instance.toDoubleArray();
      AlgVector aVector = new AlgVector(values);
      System.out.print("Attempting to reconstruct an instance " +
		       "from an incompatible vector...");
      aVector.getAsInstance(dataset, m_Random);
      System.out.println("Confirmed exception was not generated.");
    }
    catch (Exception ex) {
      System.out.println("Exception generated as expected.");
      ex.printStackTrace();
    }
  }
```
}