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
  @Test(expected = IllegalArgumentException.class)
  public void add_whenAddingDifferentLengthVectors_thenExceptionIsThrown() {
    double[] data1 = {1.0, 2.0};
    double[] data2 = {1.0, 2.0, 3.0};
    AlgVector v1 = new AlgVector(data1);
    AlgVector v2 = new AlgVector(data2);
}