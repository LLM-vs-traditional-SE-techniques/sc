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


public class CodexTest_0_9_5 { 
  @Test
  public void testAdd() throws Exception {
    AlgVector v1 = new AlgVector(new int[]{1, 2});
     AlgVector v2 = new AlgVector(new int[]{3, 4});
     AlgVector v3 = v1.add(v2);
    assertEquals(4, v3.getElement(0));
     assertEquals(6, v3.getElement(1));
  }
}