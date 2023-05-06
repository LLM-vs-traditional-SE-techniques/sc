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


public class CodexTest_0_3_25 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(3);
    a.setElement(0, 1);
    a.setElement(1, 2);
    a.setElement(2, 3);
    AlgVector b = new AlgVector(3);
    b.setElement(0, 4);
    b.setElement(1, 5);
    b.setElement(2, 6);
    AlgVector c = a.add(b);
    assertEquals("1st element differs", 5, c.getElement(0), 1e-20);
    assertEquals("2nd element differs", 7, c.getElement(1), 1e-20);
    assertEquals("3rd element differs", 9, c.getElement(2), 1e-20);
  }
}