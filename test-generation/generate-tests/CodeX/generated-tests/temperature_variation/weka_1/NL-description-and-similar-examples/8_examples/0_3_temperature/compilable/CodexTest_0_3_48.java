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


public class CodexTest_0_3_48 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1.0, 2.0, 3.0, 4.0});
    AlgVector v2 = new AlgVector(new double[]{1.0, 2.0, 3.0, 4.0});
    AlgVector v3 = v1.add(v2);
    assertEquals(4, v3.numElements());
    for (int i = 0; i < 4; i++) {
      assertEquals((i+1)*2, v3.getElement(i), 1e-10);
    }
  }
}