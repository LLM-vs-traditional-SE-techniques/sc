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
   public static void testAdd() {
    AlgVector v1 = new AlgVector(new double[] {1,2,3});
    AlgVector v2 = new AlgVector(new double[] {2,3,4});
    AlgVector v3 = v1.add(v2);
    assertEquals(3.0, v3.getElement(0));
    assertEquals(5.0, v3.getElement(1));
    assertEquals(7.0, v3.getElement(2));
   }
}