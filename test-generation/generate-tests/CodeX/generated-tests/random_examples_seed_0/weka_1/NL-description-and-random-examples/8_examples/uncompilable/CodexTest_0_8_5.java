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


public class CodexTest_0_8_5 { 
  @Test
    /**
     * matrix-vector multiplication A * x = y(i) = Sum A(i,j) * x(j);
     * @param x    the vector being multiplied by the matrix (left-hand-side)
     * @return     the resulting vector after the multiplication (right-hand-side)
     */
    public final AlgVector multiply(AlgVector x) {
      AlgVector y = null;
}