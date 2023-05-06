import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test39");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) 'a');
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (byte) 0);
        double double4 = vector1D3.getX();
        double double5 = vector1D3.getX();
        double double6 = org.apache.commons.math3.geometry.euclidean.oned.Vector1D.distanceSq(vector1D1, vector1D3);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 9409.0d + "'", double6 == 9409.0d);
    }
}

