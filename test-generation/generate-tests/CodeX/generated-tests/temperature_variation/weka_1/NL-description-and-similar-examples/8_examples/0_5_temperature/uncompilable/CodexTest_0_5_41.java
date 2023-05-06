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


public class CodexTest_0_5_41 { 
  @Test
    public void testAdd() {
    AlgVector v1 = new AlgVector(1, 2);
    AlgVector v2 = new AlgVector(3, 4);
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", 2, v3.numElements());
    assertEquals("0. value differs", 4, v3.getElement(0), 1E-8);
    assertEquals("1. value differs", 6, v3.getElement(1), 1E-8);
  }
}