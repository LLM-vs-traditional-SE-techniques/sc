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


public class CodexTest_0_8_5 { 
  @Test
  public void testAdd() {
    double[] a1 = {2.2, 3.3, 4.4};
  
    double[] a2 = {1.2, 3.3, 5.5};
    double[] res = {3.4, 6.6, 9.9};
    AlgVector v1 = new AlgVector(a1);
    AlgVector v2 = new AlgVector(a2);
    AlgVector vr = new AlgVector(res);
    AlgVector vr1 = v1.add(v2);
    assertEquals("Value differs", vr, vr1);
  }
}