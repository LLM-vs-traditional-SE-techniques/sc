import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test39");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D(0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D3 = denseDoubleMatrix1D1.assign((double) 0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D1.assign((double) 100L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D7 = denseDoubleMatrix1D1.assign((double) (byte) 1);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D9 = denseDoubleMatrix1D1.assign((double) '#');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D11 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D13 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D15 = denseDoubleMatrix1D13.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D16 = denseDoubleMatrix1D11.assign(doubleMatrix1D15);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D18 = denseDoubleMatrix1D11.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D20 = denseDoubleMatrix1D11.assign((double) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.DoubleMatrix1D doubleMatrix1D21 = denseDoubleMatrix1D1.assign(doubleMatrix1D20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incompatible sizes: 0 matrix and 97 matrix");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleMatrix1D3);
        org.junit.Assert.assertNotNull(doubleMatrix1D5);
        org.junit.Assert.assertNotNull(doubleMatrix1D7);
        org.junit.Assert.assertNotNull(doubleMatrix1D9);
        org.junit.Assert.assertNotNull(doubleMatrix1D15);
        org.junit.Assert.assertNotNull(doubleMatrix1D16);
        org.junit.Assert.assertNotNull(doubleMatrix1D18);
        org.junit.Assert.assertNotNull(doubleMatrix1D20);
    }
}

