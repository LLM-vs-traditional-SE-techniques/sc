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


public class CodexTest_0_8_1 { 
  @Test
public void testAdd() {
AlgVector v1 = new AlgVector(new double[] {1, 2, 3});
  AlgVector v2 = new AlgVector(new double[] {1, 0, 3});
   AlgVector result = v1.add(v2);
  assertArrayEquals(new double[] {2, 2, 6}, result.m_Elements, 0);
    }
}