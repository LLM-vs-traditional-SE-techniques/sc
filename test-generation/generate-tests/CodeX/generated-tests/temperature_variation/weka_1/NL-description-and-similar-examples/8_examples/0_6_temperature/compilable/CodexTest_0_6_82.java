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


public class CodexTest_0_6_82 { 
  @Test
  public void testAdd() {
    double[] arr1 = {1.0, 2.0, 3.0, 4.0};
    double[] arr2 = {5.0, 6.0, 7.0, 8.0};
    AlgVector v1 = new AlgVector(arr1);
    AlgVector v2 = new AlgVector(arr2);
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < v3.numElements(); i++) {
      assertEquals((i+1) + ". value differs", arr1[i] + arr2[i], v3.getElement(i));
    }
  }
}