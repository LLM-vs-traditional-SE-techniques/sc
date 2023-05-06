import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest8 {

    public static boolean debug = false;

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest8.test09");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D0 = null;
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D2 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double5 = vector1D4.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double8 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D4, vector1D7);
        double double9 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D2, vector1D7);
        // The following exception was thrown during execution in test generation
        try {
            double double10 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D0, vector1D7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }
}

