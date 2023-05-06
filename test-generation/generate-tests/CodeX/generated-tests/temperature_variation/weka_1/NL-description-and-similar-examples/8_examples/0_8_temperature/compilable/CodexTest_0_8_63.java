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


public class CodexTest_0_8_63 { 
  @Test
   public void testToString() {
      AlgVector v = new AlgVector(new double[]{0.0, 2.0, 3.0});
      String expected = "[0.0, 2.0, 3.0]";
      assertEquals(expected, v.toString());
   }
}