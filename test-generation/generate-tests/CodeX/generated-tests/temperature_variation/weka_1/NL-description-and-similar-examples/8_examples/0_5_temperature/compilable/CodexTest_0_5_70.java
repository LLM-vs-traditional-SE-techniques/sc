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


public class CodexTest_0_5_70 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v1 = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", len, v3.numElements());
    for (int i = 0; i < len; i++)
      assertEquals((i+1) + ". value differs", v1.getElement(i) + v2.getElement(i), v3.getElement(i));
  }
}