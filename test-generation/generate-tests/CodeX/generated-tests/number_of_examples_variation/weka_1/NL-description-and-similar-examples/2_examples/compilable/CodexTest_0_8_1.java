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


public class CodexTest_0_8_1 { 
  @Test
  public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    AlgVector v2 = new AlgVector(3);
    for (int i = 0; i < 3; i++)
      v1.setElement(i, i);
    assertNotNull(v1.add(v2));
    for (int i = 0; i < 3; i++)
      assertEquals(i, v1.add(v2).getElement(i));
    for (int i = 0; i < 3; i++)
      v2.setElement(i, i);
    for (int i = 0; i < 3; i++)
      assertEquals(2 * i, v1.add(v2).getElement(i));
  }
}