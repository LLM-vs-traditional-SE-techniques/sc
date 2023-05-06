import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test41");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 100);
        double double2 = vector1D1.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(1.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D6 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(1.0d);
        double double7 = vector1D6.getX();
        double double8 = vector1D6.getX();
        double double9 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D4, vector1D6);
        double double10 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D4);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 100.0d + "'", double2 == 100.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 9801.0d + "'", double10 == 9801.0d);
    }
}

