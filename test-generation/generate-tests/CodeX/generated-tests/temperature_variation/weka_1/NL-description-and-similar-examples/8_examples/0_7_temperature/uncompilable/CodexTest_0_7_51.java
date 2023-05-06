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


public class CodexTest_0_7_51 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1.0, 4.0});
    AlgVector v2 = new AlgVector(new double[]{2.0, 3.0});
    AlgVector v3 = v1.add(v2);
    assertTrue("Content differs", Arrays.equals(new double[]{3.0, 7.0}, v3.toArray()));
  }
}