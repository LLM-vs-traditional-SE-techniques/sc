import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test48");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D5 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D7 = denseDoubleMatrix1D5.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D8 = denseDoubleMatrix1D3.assign(doubleMatrix1D7);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D10 = denseDoubleMatrix1D3.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D12 = denseDoubleMatrix1D3.assign((double) (byte) 100);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D13 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D3);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D15 = denseDoubleMatrix1D3.assign((double) '4');
        org.junit.Assert.assertNotNull(doubleMatrix1D7);
        org.junit.Assert.assertNotNull(doubleMatrix1D8);
        org.junit.Assert.assertNotNull(doubleMatrix1D10);
        org.junit.Assert.assertNotNull(doubleMatrix1D12);
        org.junit.Assert.assertNotNull(doubleMatrix1D13);
        org.junit.Assert.assertNotNull(doubleMatrix1D15);
    }
}

