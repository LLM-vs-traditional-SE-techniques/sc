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


public class CodexTest_0_6_56 { 
  @Test
  public void testAdd() {
    int len = 10;
    double[] data = new double[len];
    AlgVector v1 = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      data[i] = i;
      v1.setElement(i, i);
      v2.setElement(i, i);
    }
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", 2 * data[i], v3.getElement(i));
    }
  }
}