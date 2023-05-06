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


public class CodexTest_0_9_4 { 
  @Test
  public void testDistanceFunction() 
    throws Exception {
    Vector v = new Vector(2);
    // for vectors, distance calculations are simpler
    v.add(new DenseInstance(1, new double[] {3, 4}));
    Instance test = new DenseInstance(1, new double[] {5, 6});
    assertEquals(5.0, m_ZeroR.classAdditionalMeasure(v, test, v));
  }
}