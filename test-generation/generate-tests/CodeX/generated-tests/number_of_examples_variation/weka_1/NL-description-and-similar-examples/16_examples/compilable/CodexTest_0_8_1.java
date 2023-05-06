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


public class CodexTest_0_8_1 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1,2,3,4,5});
    AlgVector v2 = new AlgVector(new double[]{1,2,3,4,5});
    AlgVector v3 = v1.add(v2);
    assertEquals("v1+v2", new AlgVector(new double[]{2,4,6,8,10}), v3);
    assertEquals("v1+v2 does not modify v1", new AlgVector(new double[]{1,2,3,4,5}), v1);
    assertEquals("v1+v2 does not modify v2", new AlgVector(new double[]{1,2,3,4,5}), v2);
  }
}