import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test34");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double2 = vector1D1.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double5 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D4);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((-1.0d));
        double double8 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D4, vector1D7);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D10 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (short) 1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D12 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((-1.0d));
        double double13 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D10, vector1D12);
        double double14 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D7, vector1D12);
        double double15 = vector1D7.getX();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 4.0d + "'", double13 == 4.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + (-1.0d) + "'", double15 == (-1.0d));
    }
}

