import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test27");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double2 = vector1D1.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double5 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D4);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((-1.0d));
        double double8 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D4, vector1D7);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D10 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(4.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D12 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double13 = vector1D12.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D15 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double16 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D12, vector1D15);
        double double17 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D10, vector1D12);
        double double18 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D7, vector1D12);
        double double19 = vector1D7.getX();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 16.0d + "'", double17 == 16.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 1.0d + "'", double18 == 1.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + (-1.0d) + "'", double19 == (-1.0d));
    }
}

