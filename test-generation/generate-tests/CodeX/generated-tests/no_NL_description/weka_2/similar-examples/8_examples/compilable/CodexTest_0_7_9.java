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


public class CodexTest_0_7_9 { 
  @Test
  public void testSetElement() {
    AlgVector v = new AlgVector(2);
    v.setElement(0, 1.2);
    v.setElement(1, 3.4);
    assertEquals("1. value differs", 1.2, v.getElement(0));
    assertEquals("2. value differs", 3.4, v.getElement(1));
  }
}