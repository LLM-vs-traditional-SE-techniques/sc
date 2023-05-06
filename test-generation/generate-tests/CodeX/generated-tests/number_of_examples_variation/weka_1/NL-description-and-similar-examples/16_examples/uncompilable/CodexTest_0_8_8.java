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
    public void testAdd() {
    double[][] data = { {0}, {1}, {2}, {3}, {4}, {5}, {6}, {8}, {9}};
    DoubleMatrix2D A = new SparseDoubleMatrix2D(data);
    DoubleMatrix2D B = new SparseDoubleMatrix2D(data);
    A.add(B);
    double[][] expected = { {0,0,0,0,0,0,0,0,0,0},
			{0,2,0,0,0,0,0,0,0,0},
			{0,0,4,0,0,0,0,0,0,0},
			{0,0,0,6,0,0,0,0,0,0},
			{0,0,0,0,8,0,0,0,0,0},
			{0,0,0,0,0,10,0,0,0,0},
			{0,0,0,0,0,0,12,0,0,0},
			{0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,16,0},
			{0,0,0,0,0,0,0,0,0,18}};
    assertEquals(new SparseDoubleMatrix2D(expected),A);
  }

}