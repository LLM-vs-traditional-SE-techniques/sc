import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest16 {

    public static boolean debug = false;

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest16.test17");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) (short) 0);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D(0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D3.assign((double) 0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D7 = denseDoubleMatrix1D3.assign((double) 100L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D8 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D3);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D10 = new cern.colt.matrix.impl.DenseDoubleMatrix1D(0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D12 = denseDoubleMatrix1D10.assign((double) 0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D14 = denseDoubleMatrix1D10.assign((double) 100L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D16 = denseDoubleMatrix1D10.assign((double) (byte) 1);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D18 = denseDoubleMatrix1D10.assign((double) '#');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D20 = denseDoubleMatrix1D10.assign((double) 100.0f);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D21 = denseDoubleMatrix1D1.assign(doubleMatrix1D20);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseDoubleMatrix1D3 and doubleMatrix1D21", denseDoubleMatrix1D3.equals(doubleMatrix1D21) ? denseDoubleMatrix1D3.hashCode() == doubleMatrix1D21.hashCode() : true);
    }
}

