import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test42");
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: negative size");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }
}

