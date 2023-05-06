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


public class CodexTest_0_7_8 { 
  @Test
  public void testAdd() {
    int len = 22;
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(len);
    AlgVector v2 = new AlgVector(data);
    AlgVector v3 = v.add(v2);
    
    assertEquals("Length differs", len, v3.numElements());
    
    for (int i = 0; i < len; i++) {
      if (i < data.length) {
	assertEquals("Value differs", data[i], v3.getElement(i));
      } else {
	assertEquals("Value differs", 0.0, v3.getElement(i));
      }
    }
  }
}