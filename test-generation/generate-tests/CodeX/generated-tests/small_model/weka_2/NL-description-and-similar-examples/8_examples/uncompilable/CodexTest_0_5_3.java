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


public class CodexTest_0_5_3 { 
  @Test
  public void testGetAsInstanceWithNumericAttributes() {
    Instance inst = null;
    try {
      AlgVector v = new AlgVector(new double[] {1,2,3,4});
      inst = v.getAsInstance(getModel(), new Random(1));
      assertEquals("1. value differs", 1.0, inst.value(0));
      assertEquals("2. value differs", 2.0, inst.value(1));
     
}