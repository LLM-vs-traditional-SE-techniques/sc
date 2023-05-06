import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

    public static boolean debug = false;

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test44");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(16.0d);
        double double2 = vector1D1.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D6 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double7 = vector1D6.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D9 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double10 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D6, vector1D9);
        double double11 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D4, vector1D9);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D13 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double14 = vector1D13.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D16 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double17 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D13, vector1D16);
        double double18 = vector1D16.getX();
        double double19 = vector1D16.getX();
        double double20 = vector1D16.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D22 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double23 = vector1D22.getX();
        double double24 = vector1D22.getX();
        double double25 = vector1D22.getX();
        double double26 = vector1D22.getX();
        double double27 = vector1D22.getX();
        double double28 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D16, vector1D22);
        double double29 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D9, vector1D16);
        double double30 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 16.0d + "'", double2 == 16.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.0d + "'", double20 == 0.0d);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 0.0d + "'", double23 == 0.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 0.0d + "'", double24 == 0.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 0.0d + "'", double25 == 0.0d);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 0.0d + "'", double26 == 0.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 0.0d + "'", double27 == 0.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 0.0d + "'", double28 == 0.0d);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 0.0d + "'", double29 == 0.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 256.0d + "'", double30 == 256.0d);
    }
}

