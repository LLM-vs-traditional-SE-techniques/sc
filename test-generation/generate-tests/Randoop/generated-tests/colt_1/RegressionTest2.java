import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) (short) 0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D2 = null;
        // The following exception was thrown during execution in test generation
        try {
            cern.colt.matrix.DoubleMatrix1D doubleMatrix1D3 = denseDoubleMatrix1D1.assign(doubleMatrix1D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

