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


public class CodexTest_0_9_26 { 
  @Test
     public void testAddition() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v1 = new AlgVector(data);
    double[] data2 = {3.3, 1.2, 5.0};
    AlgVector v2 = new AlgVector(data2);
    AlgVector v3 = new AlgVector(data.length);
    for(int i = 0; i < data.length; i++) {
      v3.setElement(i, data[i] + data2[i]);
    }
    AlgVector v4 = v1.add(v2);
    assertEquals("Result differs from manual addition", v3, v4);
  }
}