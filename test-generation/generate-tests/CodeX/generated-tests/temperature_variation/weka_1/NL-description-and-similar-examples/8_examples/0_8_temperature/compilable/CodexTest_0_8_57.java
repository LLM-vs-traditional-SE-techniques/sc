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


public class CodexTest_0_8_57 { 
  @Test
    public void testAdd() {
    AlgVector v = new AlgVector(new double[]{1,2,3});
    AlgVector w = new AlgVector(new double[]{2,2,2});
    AlgVector vw = v.add(w);
    assertEquals("Length differs", v.numElements(), vw.numElements());
    assertEquals("1. value differs", 3.0, vw.getElement(0), 0.0);
    assertEquals("2. value differs", 4.0, vw.getElement(1), 0.0);
    assertEquals("3. value differs", 5.0, vw.getElement(2), 0.0);
  }
}