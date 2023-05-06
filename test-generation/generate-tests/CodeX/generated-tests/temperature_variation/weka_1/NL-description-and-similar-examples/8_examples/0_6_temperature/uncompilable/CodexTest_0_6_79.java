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


public class CodexTest_0_6_79 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(10);
    AlgVector v2 = new AlgVector(10);
    AlgVector v3 = v1.add(v2);
    assertEquals("Dimension differs", v1.numElements(), v3.numElements());
    for (int i = 0; i < v1.numElements(); i++)
      assertEquals((i+1) + ". element differs", 0.0, v3.getElement(i));
}