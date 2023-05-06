import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D0 = null;
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D2 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double3 = vector1D2.getX();
        double double4 = vector1D2.getX();
        // The following exception was thrown during execution in test generation
        try {
            double double5 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D0, vector1D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }
}

