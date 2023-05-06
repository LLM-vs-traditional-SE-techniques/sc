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


public class CodexTest_0_9_4 { 
  @Test
  public void testAdd() {
    AlgVector v1 = createAlgVector(new double[] {2, 3, 5});
    AlgVector v2 = createAlgVector(new double[] {1, -5, 1});
    AlgVector v3 = v1.add(v2);
    compareVectors(new double[] {3, -2, 6}, v3);
  }
}