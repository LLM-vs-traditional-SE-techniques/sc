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


public class CodexTest_0_8_28 { 
  @Test
    public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector w = new AlgVector(data);
    for (int i = 0; i < data.length; i++) {
      v.setElement(i, i);
      w.setElement(i, i+data.length);
    }
    AlgVector u = v.add(w);
    for (int i = 0; i < data.length; i++) {
      assertEquals((i+1) + ". value differs", i + i + data.length, u.getElement(i));
    }
  }
}