import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test06");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D0 = null;
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D2 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) 10.0f);
        // The following exception was thrown during execution in test generation
        try {
            double double3 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D0, vector1D2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

