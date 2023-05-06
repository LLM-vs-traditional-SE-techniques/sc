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


public class CodexTest_0_5_3 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(2);
    AlgVector v1 = new AlgVector(2);
    v.setElement(0, 1.0);
    v.setElement(1, 2.0);
    v1.setElement(0, 3.0);
    v1.setElement(1, 4.0);
    AlgVector v2 = v.add(v1);
    assertEquals(v2.getElement(0), 4.0, 0.0);
    assertEquals(v2.getElement(1), 6.0, 0.0);
  }
}