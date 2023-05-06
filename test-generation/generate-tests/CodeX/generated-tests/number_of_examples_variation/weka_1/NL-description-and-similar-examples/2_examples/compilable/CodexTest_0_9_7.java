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
  public void testAdd() {
    AlgVector a = new AlgVector(new double[]{2.3, 1.2, 5.0});
    AlgVector b = new AlgVector(new double[]{5.5, 2.5, 10.0});
    AlgVector c = a.add(b);
    assertEquals("Length differs", a.numElements(), c.numElements());
    assertEquals("0. element differs", 7.8, c.getElement(0), 1E-12);
    assertEquals("1. element differs", 3.7, c.getElement(1), 1E-12);
    assertEquals("2. element differs", 15.0, c.getElement(2), 1E-12);
  }
}