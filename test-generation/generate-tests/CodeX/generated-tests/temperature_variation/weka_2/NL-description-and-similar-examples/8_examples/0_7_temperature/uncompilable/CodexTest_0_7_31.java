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


public class CodexTest_0_7_31 { 
  @Test
  public void testGetAsInstance() throws Exception {
    Dataset data = new Dataset();
    data.setClassIndex(1);
    data.add(new DenseInstance(new double[]{1, 2}));
    data.add(new DenseInstance(new double[]{3, 4}));
    AlgVector v = new AlgVector(new double[]{5, 6});
    Instance newI = v.getAsInstance(data, new Random(1));
    assertEquals("Class index not set correctly", 1, newI.classIndex());
    assertEquals("Number of attributes", data.numAttributes(), 
		 newI.numAttributes());
    assertEquals("Number of values", data.numAttributes(), newI.numValues());
    assertEquals("Class value", 0, (int) newI.classValue());
    assertEquals("Value at 0", 5, newI.value(0), 0);
    assertEquals("Value at 1", 6, newI.value(1), 0);
  }
}