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


public class CodexTest_0_6_9 { 
  @Test
  public void testAdd() {
      double[] data = {2.3, 1.2, 5.0};
      AlgVector vector1 = new AlgVector(data);
      AlgVector vector2 = new AlgVector(data);
      AlgVector result = vector1.add(vector2);
      for(int i = 0; i < result.numElements(); i++) {
          assertEquals((i+1) + ". value differs", data[i] * 2, result.getElement(i), 1.0e-8);
      }
  }
}