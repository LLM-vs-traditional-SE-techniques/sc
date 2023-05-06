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


public class CodexTest_0_6_53 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(new double[] {1, 2, 3, 4, 5});
    AlgVector w = new AlgVector(new double[] {2, 2, 2, 2, 2});
    AlgVector u = v.add(w);
    Assert.assertEquals("Length differs", v.numElements(), u.numElements());
    for (int i = 0; i < v.numElements(); i++) {
      Assert.assertEquals("Value differs", v.getElement(i) + w.getElement(i), u.getElement(i), 0.0);
    }
  }
}