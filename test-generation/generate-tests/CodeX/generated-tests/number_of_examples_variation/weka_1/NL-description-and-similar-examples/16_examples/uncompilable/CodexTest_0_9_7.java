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


public class CodexTest_0_9_7 { 
  @Test
  public void testMul() {
    AlgVector v = new AlgVector(2);
    v.setElement(0, 1);
    v.setElement(1, 1);
    assertEquals("Result differs", new AlgVector("[0.0, 1.0]"), v.mul(0));
    assertEquals("Result differs", new AlgVector("[1.0, 0.0]"), v.mul(2));
  }

}