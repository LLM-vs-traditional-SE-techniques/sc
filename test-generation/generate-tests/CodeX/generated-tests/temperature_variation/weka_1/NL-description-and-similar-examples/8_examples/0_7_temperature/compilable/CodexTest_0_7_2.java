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


public class CodexTest_0_7_2 { 
  @Test
  public void testAdd() {
    AlgVector a = new AlgVector(new double[] { 1.0, 2.0, 3.0 });
    AlgVector b = new AlgVector(new double[] { 6.0, 5.0, 4.0 });
    AlgVector c = new AlgVector(new double[] { 7.0, 7.0, 7.0 });
    AlgVector d = a.add(b);
    
    assertEquals(c, d);
  }
}