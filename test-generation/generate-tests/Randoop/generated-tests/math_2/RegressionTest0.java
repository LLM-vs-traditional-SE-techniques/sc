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
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D0 = null;
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = null;
        // The following exception was thrown during execution in test generation
        try {
            double double2 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D0, vector1D1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

