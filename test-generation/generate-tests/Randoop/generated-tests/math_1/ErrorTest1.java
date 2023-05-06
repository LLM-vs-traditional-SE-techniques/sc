import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test2");
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D1 = new org.apache.commons.math3.geometry.euclidean.oned.Vector1D((double) (short) 100);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D3 = vector1D1.scalarMultiply((double) 0L);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D5 = vector1D1.scalarMultiply((double) (byte) 1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D7 = vector1D1.scalarMultiply(0.0d);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D9 = vector1D7.scalarMultiply((double) (short) -1);
        org.apache.commons.math3.geometry.euclidean.oned.Vector1D vector1D11 = vector1D7.scalarMultiply((-1.0d));
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on vector1D3 and vector1D9", vector1D3.equals(vector1D9) ? vector1D3.hashCode() == vector1D9.hashCode() : true);
    }
}

