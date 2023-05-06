import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test12");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) 1);
        long long2 = hashCode1.padToLong();
        long long3 = hashCode1.padToLong();
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 1L + "'", long2 == 1L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 1L + "'", long3 == 1L);
    }
}

