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


public class CodexTest_0_9_72 { 
  @Test
  public void testAdd() {
    AlgVector v = new AlgVector(3);
    AlgVector w = new AlgVector(3);
    AlgVector z = new AlgVector(new double[]{22, 13, 10});
    v.setElement(0, 1.1);
    w.setElement(0, 2.3);
    v.setElement(1, 1.2);
    w.setElement(1, 2.1);
    v.setElement(2, 1.1);
    w.setElement(2, 3);
    assertTrue("Vector should be different", !v.equals(w));
}