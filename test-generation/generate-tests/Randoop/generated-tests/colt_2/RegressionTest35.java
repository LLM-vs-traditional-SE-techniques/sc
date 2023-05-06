import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test36");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D(1);
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D4 = denseDoubleMatrix1D1.like2D(1, 0);
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D7 = denseDoubleMatrix1D1.like2D((int) '#', (int) (short) 100);
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D10 = denseDoubleMatrix1D1.like2D((int) 'a', (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.DoubleMatrix2D doubleMatrix2D13 = denseDoubleMatrix1D1.like2D((-1), (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: negative size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(doubleMatrix2D4);
        org.junit.Assert.assertNotNull(doubleMatrix2D7);
        org.junit.Assert.assertNotNull(doubleMatrix2D10);
    }
}

