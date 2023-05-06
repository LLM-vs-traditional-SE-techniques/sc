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


public class CodexTest_0_8_3 { 
  @Test
  public static void main(String[] args) {
    // create a vector and set it to (1,2,3)
    double[][] vec = {{1,2,3}};
    DoubleMatrix2D A = DoubleFactory2D.dense.make(vec);
    System.out.println("Original Double Matrix: ");
    System.out.println(A);
}