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


public class CodexTest_0_9_81 { 
  @Test
  public static void doubleTest6Null() {
    boolean ok = false;
    double[] data={1,2,3,4,5,6};
    double[][] arrMatrix = { { 1, 2, 3, 4, 5, 6 }, { 2, 3, 4, 5, 6, 7 } };
    DoubleFactory2D f = DoubleFactory2D.dense;
    DoubleMatrix1D vector = new DenseDoubleMatrix1D(data);
    DoubleMatrix2D matrix = f.make(arrMatrix);
    try {
      vector.assign(matrix, DoubleFunctions.minus);
      ok = true;
    } catch (Exception e) {
      e.printStackTrace();
    } catch (OutOfMemoryError e) {
      e.printStackTrace();
    }
    if (ok) {
      System.out.println("doubleTest6Null: out of memory generated ok");
      ok = false;
    }}
}