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


public class CodexTest_0_9_38 { 
    @Test
    public void testAddMethod() {
    double[] a = new double[]{1, 2.34, 4.45};
    double[] b = new double[]{2, 4, 6};
    double[] c = new double[]{2, 6.34, 10.45};
    assertArrayEquals("Addition of vectors does not work", c,
        (new AlgVector(a)).add(new AlgVector(b)).getElements(), 1e-10);
  }
}