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
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) '4');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D(100);
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.DoubleMatrix1D doubleMatrix1D4 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Incompatible sizes: 52 matrix and 100 matrix");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

