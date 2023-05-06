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


public class CodexTest_0_8_11 { 
  @Test
   public void testAdd() {
      AlgVectorTest test = new AlgVectorTest();
      AlgVector a = new AlgVector(new double[]{10.0, 20.0, 30.0});
      AlgVector b = new AlgVector(new double[]{11.0, 10.0, 9.0});
      AlgVector c = a.add(b);
      AlgVector d = new AlgVector(new double[]{21.0, 30.0, 39.0});
      assertTrue(test.equals(c,d));
    }
}