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


public class CodexTest_0_4_45 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector a = new AlgVector(len);
    AlgVector b = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      a.setElement(i, i);
      b.setElement(i, i*2);
    }
    AlgVector c = a.add(b);
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", i+i*2, c.getElement(i), 0.00001);
    }
  }
}