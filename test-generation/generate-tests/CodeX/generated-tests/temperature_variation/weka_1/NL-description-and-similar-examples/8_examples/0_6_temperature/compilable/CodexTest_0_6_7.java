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


public class CodexTest_0_6_7 { 
  @Test
    public void testAdd() {
    AlgVector a = new AlgVector(new double[]{1,2,3});
    AlgVector b = new AlgVector(new double[]{4,5,6});
    AlgVector c = a.add(b);
    assertEquals("Addition failed", new AlgVector(new double[]{5,7,9}), c);
  }
}