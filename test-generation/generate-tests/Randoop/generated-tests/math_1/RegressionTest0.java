import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (short) 100);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = vector1D1.scalarMultiply((double) 10L);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D5 = vector1D3.scalarMultiply((double) 1);
        double double6 = vector1D3.getX();
        org.junit.Assert.assertNotNull(vector1D3);
        org.junit.Assert.assertNotNull(vector1D5);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 1000.0d + "'", double6 == 1000.0d);
    }
}

