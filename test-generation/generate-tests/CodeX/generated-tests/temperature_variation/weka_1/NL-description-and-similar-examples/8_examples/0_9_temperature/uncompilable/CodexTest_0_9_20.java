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


public class CodexTest_0_9_20 { 
    @Test(expected = IllegalArgumentException.class)
  public void testAdd_VectorOfDifferentLengthShouldThrowException() {
    AlgVector v = new AlgVector(new double[] { 5.1, 3.2, 5.0, 4.5 });
    AlgVector other = new AlgVector(new double[] { 1.5 });
}