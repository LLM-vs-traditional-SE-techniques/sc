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


public class CodexTest_0_7_71 { 
  @Test
    public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{2.3, 1.2, 5.0});
    AlgVector v2 = new AlgVector(new double[]{3.3, 4.2, 7.0});
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", v1.numElements(), v3.numElements());
    assertEquals("First element differs", 2.3 + 3.3, v3.getElement(0), 0.0);
    assertEquals("Second element differs", 1.2 + 4.2, v3.getElement(1), 0.0);
    assertEquals("Third element differs", 5.0 + 7.0, v3.getElement(2), 0.0);
  }
}