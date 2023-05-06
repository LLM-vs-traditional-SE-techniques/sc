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


public class CodexTest_0_6_20 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector w = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.setElement(i, 2 * i);
      w.setElement(i, 3 * i);
    }
    AlgVector sum = v.add(w);
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", 5 * i, sum.getElement(i), 1e-6);
    }
  }
}