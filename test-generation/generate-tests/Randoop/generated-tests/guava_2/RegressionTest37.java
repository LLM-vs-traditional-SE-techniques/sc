import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest37 {

    public static boolean debug = false;

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest37.test38");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong(100L);
        int int2 = hashCode1.asInt();
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 100 + "'", int2 == 100);
    }
}

