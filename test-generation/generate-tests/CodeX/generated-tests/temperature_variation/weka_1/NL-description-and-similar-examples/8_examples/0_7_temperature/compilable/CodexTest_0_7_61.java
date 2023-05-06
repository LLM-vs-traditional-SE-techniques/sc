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


public class CodexTest_0_7_61 { 
  @Test
  public void testAdd() {
    double[] data = {1.0, 2.0, 3.0};
    AlgVector v = new AlgVector(data);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v.add(v2);
    assertEquals("Length differs", data.length, v3.numElements());
    assertEquals("0. value differs", data[0] * 2.0, v3.getElement(0), Math.ulp(data[0]));
    assertEquals("1. value differs", data[1] * 2.0, v3.getElement(1), Math.ulp(data[1]));
    assertEquals("2. value differs", data[2] * 2.0, v3.getElement(2), Math.ulp(data[2]));
  }
}