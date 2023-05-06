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


public class CodexTest_0_9_6 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(5);
    AlgVector v2 = new AlgVector(5);
     for (int i = 0; i < 5; i++) {
      v1.setElement(i, i + 1);
      v2.setElement(i, 10 * i);
    }
    AlgVector v3 = v1.add(v2);
      for (int i = 0; i < 5; i++) {
      assertEquals(" " + i, v1.getElement(i) + v2.getElement(i), v3.getElement(i), 1.0E-04);
    }
  }

}