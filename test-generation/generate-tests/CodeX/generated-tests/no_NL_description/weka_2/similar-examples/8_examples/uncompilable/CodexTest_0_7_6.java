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


public class CodexTest_0_7_6 { 
  @Test
    public static void doubleTest27() {
        double[] data={1,2,3,4,5,6};
        DoubleFactory1D f = DoubleFactory1D.dense;
        DoubleMatrix1D v = f.make(data);
        double[] res = ((DenseDoubleMatrix1D)v).getValues();
}