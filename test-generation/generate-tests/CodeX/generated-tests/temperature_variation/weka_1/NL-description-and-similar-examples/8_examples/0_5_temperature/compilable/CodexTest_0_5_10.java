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


public class CodexTest_0_5_10 { 
  @Test
  public void testAddition() {
    AlgVector v1 = new AlgVector(1);
    v1.setElement(0, 1);
    AlgVector v2 = new AlgVector(1);
    v2.setElement(0, 2);
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", 1, v3.numElements());
    assertEquals("Value differs", 3, v3.getElement(0), 0.0);
  }
}