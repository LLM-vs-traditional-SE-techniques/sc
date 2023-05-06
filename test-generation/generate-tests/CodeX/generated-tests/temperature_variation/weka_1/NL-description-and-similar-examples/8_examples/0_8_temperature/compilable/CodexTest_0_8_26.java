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


public class CodexTest_0_8_26 { 
  @Test
   public void testAdd1() {
    int N = 11;
    int b = 5;
    AlgVector v0 = new AlgVector(N);
    AlgVector v1 = new AlgVector(N);
    for (int i = 0; i < N; i++) {
      v0.setElement(i, b + i);
      v1.setElement(i, 2 * b + i);
    }
    AlgVector v2 = v0.add(v1);
    for (int i = 0; i < N; i++) {
      assertEquals("Add failed", v0.getElement(i) + v1.getElement(i),
		   v2.getElement(i), 1e-6);
    }
  }
}