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


public class CodexTest_0_6_5 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector v2 = new AlgVector(new double[]{4.0, 3.0, 2.0});
    AlgVector v3 = new AlgVector(new double[]{5.0, 5.0, 5.0});
    assertEquals("Addition differs", v3, v1.add(v2));
  }
}