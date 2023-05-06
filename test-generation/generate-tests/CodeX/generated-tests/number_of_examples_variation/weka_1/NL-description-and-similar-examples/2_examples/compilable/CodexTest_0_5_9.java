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


public class CodexTest_0_5_9 { 
  @Test
    public void testAdd() {
    AlgVector v = new AlgVector(2);
    AlgVector v2 = new AlgVector(2);
    v.setElement(0, 1.5);
    v.setElement(1, 2.3);
    v2.setElement(0, 3.2);
    v2.setElement(1, 1.1);
    v = v.add(v2);
    assertEquals("Length differs", 2, v.numElements());
    assertEquals("1. value differs", 4.7, v.getElement(0), 0.0);
    assertEquals("2. value differs", 3.4, v.getElement(1), 0.0);
  }
}