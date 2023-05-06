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


public class CodexTest_0_3_7 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector w = new AlgVector(data);
    AlgVector z = v.add(w);
    for (int i = 0; i < data.length; i++) {
      assertEquals((i+1) + ". value differs", 2*data[i], z.getElement(i));
    }
  }
}