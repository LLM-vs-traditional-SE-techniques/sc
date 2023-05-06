import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test18");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D3 = denseDoubleMatrix1D1.assign((double) '#');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D1.assign((double) (byte) 100);
        org.junit.Assert.assertNotNull(doubleMatrix1D3);
        org.junit.Assert.assertNotNull(doubleMatrix1D5);
    }
}

