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


public class CodexTest_0_4_71 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(2);
    AlgVector v2 = new AlgVector(2);
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    v2.setElement(0, 3.0);
    v2.setElement(1, 4.0);
    AlgVector v3 = v.add(v2);
    assertEquals("1. element differs", 4.0, v3.getElement(0), 1e-8);
    assertEquals("2. element differs", 6.0, v3.getElement(1), 1e-8);
  }
}