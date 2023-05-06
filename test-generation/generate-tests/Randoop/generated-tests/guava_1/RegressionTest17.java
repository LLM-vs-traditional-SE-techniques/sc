import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test18");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) 'a');
        long long2 = hashCode1.padToLong();
        long long3 = hashCode1.padToLong();
        long long4 = hashCode1.padToLong();
        long long5 = hashCode1.padToLong();
        long long6 = hashCode1.padToLong();
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 97L + "'", long2 == 97L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 97L + "'", long3 == 97L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 97L + "'", long4 == 97L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 97L + "'", long5 == 97L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }
}

