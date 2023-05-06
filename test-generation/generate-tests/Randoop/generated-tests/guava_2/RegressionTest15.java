import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test16");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong(0L);
        org.junit.Assert.assertNotNull(hashCode1);
    }
}

