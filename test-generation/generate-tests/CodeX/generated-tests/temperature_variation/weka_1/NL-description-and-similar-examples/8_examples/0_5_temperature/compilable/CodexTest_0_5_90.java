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


public class CodexTest_0_5_90 { 
  @Test
  public void testAdd() {
    int n = 22;
    AlgVector v1 = new AlgVector(n);
    AlgVector v2 = new AlgVector(n);
    for (int i = 0; i < n; i++) {
      v1.setElement(i, i);
      v2.setElement(i, i * i);
    }
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < n; i++) {
      assertEquals((i+1) + ". element differs", i + i * i, v3.getElement(i));
    }
  }
}