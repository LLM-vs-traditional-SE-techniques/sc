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


public class CodexTest_0_9_9 { 
  @Test
  public void testAdd() {
    double[] dataA = {-3.0, 2.0, 0.0};
    double[] dataB = {3.0, -2.0, 0.0};
    double[] dataC = {0.0, 0.0, 0.0};
    AlgVector a = new AlgVector(dataA);
    AlgVector b = new AlgVector(dataB);
    AlgVector c = new AlgVector(dataC);
    AlgVector d = a.add(b);
    assertEquals("Length differs", a.numElements(), d.numElements());
    for(int i = 0; i < dataC.length; i++)
      assertEquals("Diff" + i, c.getElement(i), d.getElement(i));
    }
}