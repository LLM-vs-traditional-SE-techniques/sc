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


public class CodexTest_0_8_8 { 
  @Test
    public void testSubtract() {
    double[] a = {2.0, 5.0, 8.0};
    double[] c = {1.0, 3.0, 4.0};
    AlgVector av = new AlgVector(a);
    AlgVector cv = new AlgVector(c);
    AlgVector result = cv.add(av);
}