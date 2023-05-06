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


public class CodexTest_0_7_81 { 
  @Test
    public void testAdd() {
      double[] data = {2.3, 1.2, 5.0};
      AlgVector v1 = new AlgVector(data);
      AlgVector v2 = new AlgVector(data);
      AlgVector v3 = v1.add(v2);
      AlgVector v4 = new AlgVector(data);
      v4.addEquals(v2);
      assertEquals("add() result differs", v3, v4);
    }
}