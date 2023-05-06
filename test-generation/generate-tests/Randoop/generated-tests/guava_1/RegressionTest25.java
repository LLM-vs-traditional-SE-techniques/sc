import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test26");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) (short) -1);
        long long2 = hashCode1.padToLong();
        long long3 = hashCode1.padToLong();
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + (-1L) + "'", long2 == (-1L));
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + (-1L) + "'", long3 == (-1L));
    }
}

