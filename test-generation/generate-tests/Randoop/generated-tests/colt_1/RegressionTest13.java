import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test14");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) (short) 0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D3 = denseDoubleMatrix1D1.assign((double) (short) 100);
        org.junit.Assert.assertNotNull(doubleMatrix1D3);
    }
}

