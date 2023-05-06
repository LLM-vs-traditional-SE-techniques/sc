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


public class CodexTest_0_9_84 { 
  @Test
  public void testAddVector() throws Exception {
    AlgVector a = getAlgVector(new double[]{3.4, 4.2});
    AlgVector r = getAlgVector(new double[]{5.5, 6.1});
    assertEquals(r, a.add(getAlgVector(new double[]{2.1, 1.9})));
  }
}