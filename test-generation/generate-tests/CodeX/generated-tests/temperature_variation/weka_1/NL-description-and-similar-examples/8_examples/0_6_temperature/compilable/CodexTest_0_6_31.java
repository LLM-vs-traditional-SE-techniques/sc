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


public class CodexTest_0_6_31 { 
  @Test
  public void testAdd() {
    double[] data = {2.3, 1.2, 5.0};
    AlgVector v = new AlgVector(data);
    AlgVector w = v.add(v);
    for (int i = 0; i < data.length; i++)
      assertEquals(i + ". element differs", 2*data[i], w.getElement(i));
  }
}