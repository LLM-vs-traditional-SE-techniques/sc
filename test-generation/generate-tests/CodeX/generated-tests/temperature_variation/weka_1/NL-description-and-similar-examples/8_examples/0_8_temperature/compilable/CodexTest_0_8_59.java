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


public class CodexTest_0_8_59 { 
  @Test
  public void testAdd() {
    int len = 43;
    AlgVector v = new AlgVector(len);
    AlgVector w = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.setElement(i, i);
      w.setElement(i, i * 10);
    }
    AlgVector r = v.add(w);
    for (int i = 0; i < len; i++) {
      assertEquals((i + 1) + ". value differs", i + i * 10, r.getElement(i));
    }
  }
}