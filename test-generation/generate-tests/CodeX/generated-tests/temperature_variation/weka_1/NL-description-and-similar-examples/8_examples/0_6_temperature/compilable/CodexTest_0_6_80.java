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


public class CodexTest_0_6_80 { 
  @Test
  public void testAdd() {
    int len = 22;
    AlgVector v = new AlgVector(len);
    AlgVector v2 = new AlgVector(len);
    AlgVector v3 = v.add(v2);
    assertEquals("Wrong length", len, v3.numElements());
    for (int i = 0; i < len; i++)
      assertEquals("Wrong element", 0.0, v3.getElement(i));
  }
}