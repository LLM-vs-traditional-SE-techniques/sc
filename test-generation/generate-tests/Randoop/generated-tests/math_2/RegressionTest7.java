import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test08");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double2 = vector1D1.getX();
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D4 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double5 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D4);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((-1.0d));
        double double8 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D4, vector1D7);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D10 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(1.0d);
        double double11 = vector1D10.getX();
        double double12 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D4, vector1D10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 1.0d + "'", double8 == 1.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 1.0d + "'", double11 == 1.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 1.0d + "'", double12 == 1.0d);
    }
}

