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


public class CodexTest_0_8_95 { 
  @Test
  public static void testGetAsInstance() throws Exception {
    RaisableInstances test = Data.getRaisableDataSet();
    AlgVector vector = new AlgVector(test.numAttributes());
    Instance orig = test.instance(0);
    assertEquals(Data.getOptimalInstance(), vector.getAsInstance(test, new OptimalRandom(0L)));
    assertEquals(Data.getRandomInstance(), vector.getAsInstance(test, new OptimalRandom(0L)));
    assertEquals(Data.getRandomInstance(), vector.getAsInstance(test, new OptimalRandom(0L)));
  }
}