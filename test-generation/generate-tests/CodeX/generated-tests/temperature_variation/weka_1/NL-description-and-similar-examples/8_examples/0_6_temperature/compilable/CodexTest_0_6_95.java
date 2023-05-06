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


public class CodexTest_0_6_95 { 
  @Test
  public void testAdd() {
    double[] data = {1.0,2.0,3.0};
    AlgVector v = new AlgVector(data);
    AlgVector n = v.add(v);
    assertEquals(2.0, n.getElement(0), 0.0);
    assertEquals(4.0, n.getElement(1), 0.0);
    assertEquals(6.0, n.getElement(2), 0.0);
  }
}