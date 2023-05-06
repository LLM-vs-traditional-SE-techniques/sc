import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test42");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double2 = vector1D1.getX();
        double double3 = vector1D1.getX();
        double double4 = vector1D1.getX();
        double double5 = vector1D1.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (-1L));
        double double8 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D7);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D10 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double11 = vector1D10.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D13 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double14 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D10, vector1D13);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D16 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double17 = vector1D16.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D19 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double20 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D16, vector1D19);
        double double21 = vector1D19.getX();
        double double22 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D13, vector1D19);
        double double23 = vector1D13.getX();
        double double24 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D13);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 0.0d + "'", double21 == 0.0d);
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
    }
}

