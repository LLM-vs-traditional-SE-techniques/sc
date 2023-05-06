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


public class CodexTest_0_4_75 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1.0, 2.0, 3.0});
    AlgVector v2 = new AlgVector(new double[]{2.0, 3.0, 4.0});
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", v1.numElements(), v3.numElements());
    for (int i = 0; i < v1.numElements(); i++)
      assertEquals((i+1) + ". value differs", v1.getElement(i) + v2.getElement(i), v3.getElement(i));
  }
}