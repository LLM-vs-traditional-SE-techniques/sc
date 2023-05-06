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


public class CodexTest_0_8_32 { 
  @Test
  public void testAdd_Nan() {
      double[] data1 = { 2.6, Double.NaN };
      double[] data2 = { 4.5, 4.5 };
      AlgVector v1 = new AlgVector(data1);
      AlgVector v2 = new AlgVector(data2);
      try {
          v1.add(v2);
          fail("Should not accept NaN as argument");
      } catch (ArithmeticException ex) {
          // NaN should not be accepted
      }
      try {
          v2.add(v1);
          fail("Should not accept NaN as argument");
      } catch (ArithmeticException ex) {
          // NaN should not be accepted
      }
  }
}