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
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) '#');
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D4 = denseDoubleMatrix1D1.like2D(10, (int) 'a');
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D7 = denseDoubleMatrix1D1.like2D((int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(doubleMatrix2D4);
        org.junit.Assert.assertNotNull(doubleMatrix2D7);
    }
}

