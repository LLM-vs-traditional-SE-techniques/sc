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


public class CodexTest_0_5_4 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{2, 3, 5});
    AlgVector v2 = new AlgVector(new double[]{1, -1, 0});
    AlgVector v3 = new AlgVector(new double[]{3, 2, 5});
    assertEquals("Vector addition failed", v3, v1.add(v2));
  }
}