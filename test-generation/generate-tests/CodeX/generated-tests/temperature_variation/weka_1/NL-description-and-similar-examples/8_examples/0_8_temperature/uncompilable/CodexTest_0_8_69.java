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


public class CodexTest_0_8_69 { 
  @Test
  public void testAdd() {
    // TODO review the generated test code and remove the default call to fail.
    double vals[] = {0.5, 1.5, 0.5};
    AlgVector v = AlgVector.fromArray(vals);
    AlgVector v2 = new AlgVector(vals.length);
    AlgVector v3 = v.add(v2);
    double sum = 0.0;
    for(int i = 0; i < vals.length; i++) {
      sum += v3.getElement(i);
    }
    assertEquals(vals.length, sum, 0.0);
  }
}