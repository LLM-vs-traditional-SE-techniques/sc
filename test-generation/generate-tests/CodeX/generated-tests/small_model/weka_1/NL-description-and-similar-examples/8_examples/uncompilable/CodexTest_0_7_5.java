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


public class CodexTest_0_7_5 { 
  @Test
    public void testAdd() {
      double[] expected = { 1.0, 2.0, 3.0, 4.0, 5.0, 6.0 };
      AlgVector v1 = new AlgVector(expected);
      AlgVector v2 = new AlgVector(expected);
      AlgVector v3 = v1.add(v2);
}