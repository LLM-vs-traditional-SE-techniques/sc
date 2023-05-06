import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest11 {

    public static boolean debug = false;

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest11.test12");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D(0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D3 = denseDoubleMatrix1D1.assign(10.0d);
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D5 = new cern.colt.matrix.impl.DenseDoubleMatrix1D(0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D7 = denseDoubleMatrix1D5.assign((double) 0);
        cern.colt.matrix.DoubleMatrix1D doubleMatrix1D8 = denseDoubleMatrix1D1.assign((cern.colt.matrix.DoubleMatrix1D) denseDoubleMatrix1D5);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on doubleMatrix1D8 and denseDoubleMatrix1D5", doubleMatrix1D8.equals(denseDoubleMatrix1D5) ? doubleMatrix1D8.hashCode() == denseDoubleMatrix1D5.hashCode() : true);
    }
}

