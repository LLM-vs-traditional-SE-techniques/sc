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


public class CodexTest_0_7_3 { 
  @Test
  public void testAdd() {
    int len = 5;
    AlgVector v = new AlgVector(len);
    AlgVector u = new AlgVector(len);
    double[] arr = {2.3, 1.2, 5.0, 5.1, 7.1};
    v.set(arr);
    u.set(arr);
    AlgVector w = v.add(u);
    for(int i = 0; i < len; i++) {
      assertEquals((i+1) + ". value differs", arr[i] + arr[i], w.getElement(i));
    }
  }
}