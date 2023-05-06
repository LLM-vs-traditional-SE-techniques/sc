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


public class CodexTest_0_8_30 { 
  @Test
  public void testAdd() {
    double[] data1 = {1.0, 2.0, 3.0};
    double[] data2 = {2.0, 3.0, 4.0};
  
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
    AlgVector r = v1.add(v2);
  
    assertEquals("Length differs", 3, r.numElements());
    assertEquals("1. value differs", 3.0, r.getElement(0));
    assertEquals("2. value differs", 5.0, r.getElement(1));
    assertEquals("3. value differs", 7.0, r.getElement(2));
  }
  
}