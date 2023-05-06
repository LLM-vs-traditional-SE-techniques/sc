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


public class CodexTest_0_9_99 { 
  @Test
  public void testGetAsInstanceWithNegativeClassIndex() throws Exception {
    instance.setDataset(null);
    try {
      instance.getAsInstance(instanceWithNegativeClassIndex, null);
      fail("Should raise an IllegalArgumentException");
    } catch (IllegalArgumentException ex) {
      // success
    }
  }
}