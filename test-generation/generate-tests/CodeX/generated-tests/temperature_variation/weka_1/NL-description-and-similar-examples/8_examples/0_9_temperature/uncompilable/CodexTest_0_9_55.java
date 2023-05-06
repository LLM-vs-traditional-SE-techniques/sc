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


public class CodexTest_0_9_55 { 
  @Test
  public void testScalarMultiplication() {
    double[] data = { 1, 2, 3, 4, 5, 6 };
    double scalar = 2.5;
    AlgVector v = new AlgVector(data);
    AlgVector res = v.scalarMultiplication(scalar);
    assertEquals("Length differs", data.length, res.numElements());
}