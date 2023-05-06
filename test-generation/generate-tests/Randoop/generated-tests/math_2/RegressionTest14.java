import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test15");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(1.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D(1.0d);
        double double4 = vector1D3.getX();
        double double5 = vector1D3.getX();
        double double6 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D3);
        double double7 = vector1D1.getX();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 1.0d + "'", double4 == 1.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 1.0d + "'", double5 == 1.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 1.0d + "'", double7 == 1.0d);
    }
}

