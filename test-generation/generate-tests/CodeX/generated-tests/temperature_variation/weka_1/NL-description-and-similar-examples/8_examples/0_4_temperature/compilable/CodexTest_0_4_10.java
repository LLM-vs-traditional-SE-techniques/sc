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


public class CodexTest_0_4_10 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v1 = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v1.setElement(i, i);
      v2.setElement(i, i*2);
    }
    AlgVector v3 = v1.add(v2);
    for (int i = 0; i < len; i++) {
      assertEquals(i+i*2, v3.getElement(i));
    }
  }
}