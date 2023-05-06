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


public class CodexTest_0_5_46 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {2, 3, 5, 7, 11});
    AlgVector v2 = new AlgVector(new double[] {13, 17, 19, 23, 29});
    AlgVector v3 = new AlgVector(new double[] {15, 20, 24, 30, 40});
    assertEquals("Addition of vectors failed", v3, v1.add(v2));
  }
}