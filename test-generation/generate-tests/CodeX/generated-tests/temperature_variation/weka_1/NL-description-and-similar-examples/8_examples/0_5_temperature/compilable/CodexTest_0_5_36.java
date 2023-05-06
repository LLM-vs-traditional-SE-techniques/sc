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


public class CodexTest_0_5_36 { 
  @Test
    public void testAdd() {
    AlgVector v1 = new AlgVector(3);
    AlgVector v2 = new AlgVector(3);
    AlgVector v3 = new AlgVector(3);
    v1.setElement(0, 1.0);
    v1.setElement(1, 2.0);
    v1.setElement(2, 3.0);
    v2.setElement(0, 4.0);
    v2.setElement(1, 5.0);
    v2.setElement(2, 6.0);
    v3.setElement(0, 5.0);
    v3.setElement(1, 7.0);
    v3.setElement(2, 9.0);
    assertEquals("Addition failed", v3, v1.add(v2));
  }
}