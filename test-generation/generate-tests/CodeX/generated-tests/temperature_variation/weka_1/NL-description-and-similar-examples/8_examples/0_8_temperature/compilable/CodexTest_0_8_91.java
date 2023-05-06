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


public class CodexTest_0_8_91 { 
  @Test
  public void testPlus() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector w = new AlgVector(data);
    AlgVector u = v.add(w);
    double[] expData = {4.6, 2.4, 10.0};
    AlgVector expected = new AlgVector(expData);
    assertEquals("Vector differs", expected, u);
  }
}