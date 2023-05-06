import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test40");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((-1L));
        org.junit.Assert.assertNotNull(hashCode1);
    }
}

