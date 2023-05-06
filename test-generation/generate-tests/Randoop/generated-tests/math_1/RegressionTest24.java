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
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (short) 100);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = vector1D1.scalarMultiply((double) 0L);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D5 = vector1D1.scalarMultiply((double) (byte) 1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = vector1D1.scalarMultiply(0.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D9 = vector1D1.scalarMultiply((double) (byte) -1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D11 = vector1D9.scalarMultiply(0.0d);
        double double12 = vector1D11.getX();
        double double13 = vector1D11.getX();
        org.junit.Assert.assertNotNull(vector1D3);
        org.junit.Assert.assertNotNull(vector1D5);
        org.junit.Assert.assertNotNull(vector1D7);
        org.junit.Assert.assertNotNull(vector1D9);
        org.junit.Assert.assertNotNull(vector1D11);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + (-0.0d) + "'", double12 == (-0.0d));
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + (-0.0d) + "'", double13 == (-0.0d));
    }
}

