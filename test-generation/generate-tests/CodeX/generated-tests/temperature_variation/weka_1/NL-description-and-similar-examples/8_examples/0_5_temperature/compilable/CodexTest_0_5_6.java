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


public class CodexTest_0_5_6 { 
  @Test
    public void testAdd() {
    AlgVector a = new AlgVector(new double[]{1, 2, 3, 4});
    AlgVector b = new AlgVector(new double[]{5, 6, 7, 8});
    AlgVector c = a.add(b);
    double[] expected = {6, 8, 10, 12};
    assertArrayEquals(expected, c.getElements(), 0);
  }
}