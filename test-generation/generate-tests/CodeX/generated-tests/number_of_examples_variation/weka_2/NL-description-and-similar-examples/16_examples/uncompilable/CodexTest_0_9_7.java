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


public class CodexTest_0_9_7 { 
  @Test
  public void testDistance() {
    Vector1D v1 = new Vector1D(1);
    Vector1D v2 = new Vector1D(-4);
    Assert.assertEquals(0.0, Vector1D.distance(new Vector1D(-1), new Vector1D(-1)), 0);
    Assert.assertEquals(5.0, Vector1D.distance(v1, v2), 1.0e-12);
    Assert.assertEquals(v1.subtract(v2).getNorm(), Vector1D.distance(v1, v2), 1.0e-12);
  }
}