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


public class CodexTest_0_8_43 { 
  @Test
  public void testAddVectorWithSameLength() {
    int length = 3;
    double[] a = {4.4, 1.2, 5.1};
    double[] b = {3.3, 9.1, 1.7};
    AlgVector v1 = new AlgVector(a);
    AlgVector v2 = new AlgVector(b);
    AlgVector v3 = v1.add(v2);
}