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


public class CodexTest_0_9_34 { 
  @Test
  public void testGetAsInstanceWithRandom() {
    AlgVector algVector = new AlgVector(new int[]{1, 2, 3, 4});
    String testFile = "test/junit/weka/core/matrix/MockDataSet.arff";
    try {
      ArffLoader arffLoader = new ArffLoader();
      arffLoader.setFile(new File(testFile));
      Instances dataSet = arffLoader.getDataSet();
      algVector.getAsInstance(dataSet, new Random());
    } catch (IOException e) {
      e.printStackTrace();
      fail();
    } catch (Exception e) {
      e.printStackTrace();
      fail();
    }
  }
}