import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest6 {

    public static boolean debug = false;

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest6.test07");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D3.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D6 = denseDoubleMatrix1D1.assign(doubleMatrix1D5);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D8 = denseDoubleMatrix1D1.assign((double) (byte) 10);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D10 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D12 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D14 = denseDoubleMatrix1D12.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D15 = denseDoubleMatrix1D10.assign(doubleMatrix1D14);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D17 = denseDoubleMatrix1D10.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D18 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D10);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseDoubleMatrix1D3 and denseDoubleMatrix1D12", denseDoubleMatrix1D3.equals(denseDoubleMatrix1D12) ? denseDoubleMatrix1D3.hashCode() == denseDoubleMatrix1D12.hashCode() : true);
    }
}

