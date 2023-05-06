import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

    public static boolean debug = false;

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test43");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double2 = vector1D1.getX();
        double double3 = vector1D1.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D5 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double6 = vector1D5.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D8 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double9 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D5, vector1D8);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D11 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((-1.0d));
        double double12 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D8, vector1D11);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D14 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (short) 1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D16 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((-1.0d));
        double double17 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D14, vector1D16);
        double double18 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D11, vector1D16);
        double double19 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D16);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 4.0d + "'", double17 == 4.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 1.0d + "'", double19 == 1.0d);
    }
}

