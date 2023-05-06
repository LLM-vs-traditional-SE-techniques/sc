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


public class CodexTest_0_6_3 { 
  @Test
    public void testAdd() {
    AlgVector v1 = new AlgVector(10);
    AlgVector v2 = new AlgVector(10);
    for(int i = 0; i < 10; i++) {
      v1.setElement(i, i);
      v2.setElement(i, 10+i);
    }
    AlgVector v3 = v1.add(v2);
    assertTrue(v3.numElements() == 10);
    for(int i = 0; i < 10; i++) {
      assertTrue(v3.getElement(i) == i+10+i);
    }
    }
}