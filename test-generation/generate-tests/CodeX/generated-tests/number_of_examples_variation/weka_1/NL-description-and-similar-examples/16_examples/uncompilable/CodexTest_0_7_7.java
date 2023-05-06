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


public class CodexTest_0_7_7 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(random, 20);
    AlgVector b = new AlgVector(random, 20);
    AlgVector c = a.add(b);
    for (int i = 0; i < c.getDimension(); i++) {
      assertEquals(a.getElement(i) + b.getElement(i), c.getElement(i));
    }
  }
}