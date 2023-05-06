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


public class CodexTest_0_1_1 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{1, 2, 3});
    AlgVector v2 = new AlgVector(new double[]{4, 5, 6});
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", v1.numElements(), v3.numElements());
    for (int i = 0; i < v1.numElements(); i++)
      assertEquals((i+1) + ". value differs", v1.getElement(i) + v2.getElement(i), v3.getElement(i));
  }
}