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


public class CodexTest_0_7_1 { 
  @Test
  
  public void testAdd() {
    AlgVector v1 = new AlgVector(new double[]{0.0, 0.0, 0.0});
    AlgVector v2 = new AlgVector(new double[]{1.0, 1.0, 1.0});
    AlgVector v3 = v1.add(v2);
    assertEquals("Length differs", 3, v3.numElements());
    assertEquals("1. value differs", 1.0, v3.getElement(0));
    assertEquals("2. value differs", 1.0, v3.getElement(1));
    assertEquals("3. value differs", 1.0, v3.getElement(2));
    assertEquals("Length differs", 3, v1.numElements());
    assertEquals("1. value differs", 0.0, v1.getElement(0));
    assertEquals("2. value differs", 0.0, v1.getElement(1));
    assertEquals("3. value differs", 0.0, v1.getElement(2));
    assertEquals("Length differs", 3, v2.numElements());
    assertEquals("1. value differs", 1.0, v2.getElement(0));
   
}