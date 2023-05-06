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


public class CodexTest_0_7_17 { 
  @Test
    public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{2, 2});
    AlgVector v2 = new AlgVector(new double[]{5, 2});
    AlgVector result = v1.add(v2);
    assertEquals("2 + 5", 7, result.getElement(0), 0.01);
    assertEquals("2 + 2", 4, result.getElement(1), 0.01);
  }
}