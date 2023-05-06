import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest8 {

    public static boolean debug = false;

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test09");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D3 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D5 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D7 = denseDoubleMatrix1D5.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D8 = denseDoubleMatrix1D3.assign(doubleMatrix1D7);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D10 = denseDoubleMatrix1D3.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D12 = denseDoubleMatrix1D3.assign((double) (byte) 100);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D13 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D3);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D15 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D17 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D19 = denseDoubleMatrix1D17.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D20 = denseDoubleMatrix1D15.assign(doubleMatrix1D19);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D22 = denseDoubleMatrix1D15.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D24 = denseDoubleMatrix1D15.assign((double) (byte) 100);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D25 = denseDoubleMatrix1D1.assign(doubleMatrix1D24);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on denseDoubleMatrix1D3 and doubleMatrix1D25", denseDoubleMatrix1D3.equals(doubleMatrix1D25) ? denseDoubleMatrix1D3.hashCode() == doubleMatrix1D25.hashCode() : true);
    }
}

