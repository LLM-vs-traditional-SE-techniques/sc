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


public class CodexTest_0_6_78 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    AlgVector v2 = new AlgVector(3);
    v1.setElement(0, 1.0);
    v1.setElement(1, 2.0);
    v1.setElement(2, 3.0);
    v2.setElement(0, 1.0);
    v2.setElement(1, 2.0);
    v2.setElement(2, 3.0);
    AlgVector v3 = v1.add(v2);
    assertEquals("1. element differs", 2.0, v3.getElement(0), 1E-7);
    assertEquals("2. element differs", 4.0, v3.getElement(1), 1E-7);
    assertEquals("3. element differs", 6.0, v3.getElement(2), 1E-7);
  }
}