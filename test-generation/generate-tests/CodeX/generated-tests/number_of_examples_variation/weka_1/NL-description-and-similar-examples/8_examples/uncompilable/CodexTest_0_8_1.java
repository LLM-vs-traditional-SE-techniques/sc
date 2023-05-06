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


public class CodexTest_0_8_1 { 
  @Test
   public void testGetElement() {
   // create the instance to test
    AlgVector fixture = new AlgVector();
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    // verify the result
    double[] result = v.add(v2).getElements();
    assertArrayEquals(new double[] {4.6,2.4,10}, result);
  }
}