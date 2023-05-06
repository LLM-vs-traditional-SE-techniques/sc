import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test34");
        cern.colt.matrix.impl.DenseDoubleMatrix1D denseDoubleMatrix1D1 = new cern.colt.matrix.impl.DenseDoubleMatrix1D((int) (byte) 100);
        cern.colt.matrix.DoubleMatrix2D doubleMatrix2D4 = denseDoubleMatrix1D1.like2D(100, (int) '4');
        org.junit.Assert.assertNotNull(doubleMatrix2D4);
    }
}

