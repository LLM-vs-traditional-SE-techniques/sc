import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test27");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) '#');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D5 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D7 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D9 = denseDoubleMatrix1D7.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D10 = denseDoubleMatrix1D5.assign(doubleMatrix1D9);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D12 = denseDoubleMatrix1D5.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D14 = denseDoubleMatrix1D5.assign((double) (byte) 100);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D15 = denseDoubleMatrix1D3.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D5);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D17 = denseDoubleMatrix1D3.assign((double) (-1));
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.DoubleMatrix1D doubleMatrix1D18 = denseDoubleMatrix1D1.assign(doubleMatrix1D17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incompatible sizes: 35 matrix and 97 matrix");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleMatrix1D9);
        org.junit.Assert.assertNotNull(doubleMatrix1D10);
        org.junit.Assert.assertNotNull(doubleMatrix1D12);
        org.junit.Assert.assertNotNull(doubleMatrix1D14);
        org.junit.Assert.assertNotNull(doubleMatrix1D15);
        org.junit.Assert.assertNotNull(doubleMatrix1D17);
    }
}

