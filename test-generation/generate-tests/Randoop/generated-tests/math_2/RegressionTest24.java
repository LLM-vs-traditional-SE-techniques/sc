import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test25");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(10.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 100);
        double double4 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 8100.0d + "'", double4 == 8100.0d);
    }
}

