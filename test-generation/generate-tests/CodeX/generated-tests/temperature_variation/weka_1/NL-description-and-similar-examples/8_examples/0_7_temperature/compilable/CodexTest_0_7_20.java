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


public class CodexTest_0_7_20 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    double[] data2 = {1.0, -1.0, 9.0};
    AlgVector v = new AlgVector(data);
    AlgVector v2 = new AlgVector(data2);
    AlgVector vr = v.add(v2);
    assertEquals("Length differs", data.length, vr.numElements());
    assertEquals("[0] differs", data[0] + data2[0], vr.getElement(0), 1e-7);
    assertEquals("[1] differs", data[1] + data2[1], vr.getElement(1), 1e-7);
    assertEquals("[2] differs", data[2] + data2[2], vr.getElement(2), 1e-7);
  }
}