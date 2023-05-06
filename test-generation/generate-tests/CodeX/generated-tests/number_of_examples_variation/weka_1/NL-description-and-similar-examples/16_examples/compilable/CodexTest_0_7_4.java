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


public class CodexTest_0_7_4 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(new double[] {1, 2, 3, 4, 5});
    AlgVector u = new AlgVector(new double[] {6, 7, 8, 9, 10});
    AlgVector w = new AlgVector(new double[] {7, 9, 11, 13, 15});
    assertEquals("Addition not correct", w, u.add(v));
    assertEquals("Addition not correct", w, v.add(u));
  }
}