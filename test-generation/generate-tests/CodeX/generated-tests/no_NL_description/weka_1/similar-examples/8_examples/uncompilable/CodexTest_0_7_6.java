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


public class CodexTest_0_7_6 { 
  @Test
  public void testAdd3() {
    AlgVector v1 = new AlgVector(3);
    AlgVector v2 = new AlgVector(3);
    AlgVector v3 = new AlgVector(3);
    v1.set(0, 1.0);
    v1.set(1, 2.0);
    v1.set(2, 3.0);
    v2.set(0, 1.0);
    v2.set(1, 2.0);
    v2.set(2, 3.0);
    v3.set(0, 2.0);
    v3.set(1, 4.0);
    v3.set(2, 6.0);
    assertTrue("Addition failed", v3.equals(v1.add(v2)));
  }

}