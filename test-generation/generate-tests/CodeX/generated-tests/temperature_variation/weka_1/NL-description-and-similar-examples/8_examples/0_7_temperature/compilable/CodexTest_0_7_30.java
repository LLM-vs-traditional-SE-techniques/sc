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


public class CodexTest_0_7_30 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{2.5, 1.5, 4.5});
    AlgVector v2 = new AlgVector(new double[]{3.5, 2.5, 5.5});
    AlgVector v3 = v1.add(v2);
    AlgVector v4 = new AlgVector(new double[]{6, 4, 10});
    assertEquals("Wrong value", v3, v4);
  }
}