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


public class CodexTest_0_3_8 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector w = new AlgVector(len);
    for (int i = 0; i < len; i++) {
      v.setElement(i, i);
      w.setElement(i, i+1);
    }
    AlgVector z = v.add(w);
    for (int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", i+i+1, z.getElement(i));
    }
  }
}