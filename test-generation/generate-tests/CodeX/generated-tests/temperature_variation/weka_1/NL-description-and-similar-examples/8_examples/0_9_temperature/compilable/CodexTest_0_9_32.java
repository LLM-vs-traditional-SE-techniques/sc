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


public class CodexTest_0_9_32 { 
  @Test
     public void testAdd() {
      
      double[] a = {1, 2, 3};
      double[] b = {4, 5, 6};
      AlgVector v1 = new AlgVector(a);
      AlgVector v2 = new AlgVector(b);
      
      double[] c = {5, 7, 9};
      AlgVector v3 = new AlgVector(c);
      
      Assert.assertArrayEquals(v3.getElements(), v1.add(v2).getElements(), 0.000000001);
    }
}