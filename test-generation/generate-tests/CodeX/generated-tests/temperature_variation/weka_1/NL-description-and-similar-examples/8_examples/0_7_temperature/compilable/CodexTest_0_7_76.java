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


public class CodexTest_0_7_76 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] { 1.0, 2.0, 3.0, 4.0 });
    AlgVector b = new AlgVector(new double[] { 1.0, 2.0, 3.0, 4.0 });
    AlgVector c = a.add(b);
    assertEquals("3. element differs", 7.0, c.getElement(2), 0.0);
  }
}