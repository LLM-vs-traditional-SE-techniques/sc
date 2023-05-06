import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest9 {

    public static boolean debug = false;

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest9.test10");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D3 = denseDoubleMatrix1D1.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D5 = denseDoubleMatrix1D1.assign((double) (byte) 1);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D7 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D9 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) 'a');
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D11 = denseDoubleMatrix1D9.assign((double) 0L);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D12 = denseDoubleMatrix1D7.assign(doubleMatrix1D11);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D14 = denseDoubleMatrix1D7.assign((double) (byte) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D16 = denseDoubleMatrix1D7.assign((double) 100.0f);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D18 = denseDoubleMatrix1D7.assign((double) (short) 10);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D19 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D7);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on doubleMatrix1D19 and denseDoubleMatrix1D7", doubleMatrix1D19.equals(denseDoubleMatrix1D7) ? doubleMatrix1D19.hashCode() == denseDoubleMatrix1D7.hashCode() : true);
    }
}

