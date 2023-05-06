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


public class CodexTest_0_8_58 { 
  @Test
  public void testAddTwo() {
    double[] data1 = {1.0, 2.0};
    double[] data2 = {5.0, 6.0};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    AlgVector v3 = v1.add(v2);
    assertEquals(v1.getElement(0) + v2.getElement(0), v3.getElement(0));
    assertEquals(v1.getElement(1) + v2.getElement(1), v3.getElement(1));
  }
}