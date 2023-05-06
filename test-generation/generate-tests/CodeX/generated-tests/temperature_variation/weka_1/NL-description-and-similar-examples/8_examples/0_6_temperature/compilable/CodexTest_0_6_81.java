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


public class CodexTest_0_6_81 { 
  @Test
    public void testAdd() {
       double[] data = {1.0, 1.0, 1.0};
       AlgVector v1 = new AlgVector(data);
       AlgVector v2 = new AlgVector(data);
       AlgVector v3 = v1.add(v2);
       double[] data3 = {2.0, 2.0, 2.0};
       AlgVector v4 = new AlgVector(data3);
       assertTrue(v3.equals(v4));
     }
}