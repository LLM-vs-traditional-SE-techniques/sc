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


public class CodexTest_0_8_46 { 
  @Test
  public void testAdd() {
    double[] aData = {1, 2, 3, 4, 5, 6};
    double[] bData = {6, 5, 4, 3, 2, 1};
    double[] expData = {7, 7, 7, 7, 7, 7};
    AlgVector a = new AlgVector(aData);
    AlgVector b = new AlgVector(bData);
    AlgVector exp = new AlgVector(expData);
    AlgVector result = a.add(b);
    assertEquals("Wrong result", exp, result);
  }
}