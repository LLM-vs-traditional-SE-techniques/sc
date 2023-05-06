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


public class CodexTest_0_6_91 { 
  @Test
  public void testAdd() throws Exception {
    AlgVector v1 = new AlgVector(new double[]{2.0, 3.0, 5.0});
    AlgVector v2 = new AlgVector(new double[]{7.0, 11.0, 13.0});
    AlgVector v3 = new AlgVector(new double[]{9.0, 14.0, 18.0});
    assertEquals(v3, v1.add(v2));
  }
}