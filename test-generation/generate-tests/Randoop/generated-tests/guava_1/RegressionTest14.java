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
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong(52L);
        org.junit.Assert.assertNotNull(hashCode1);
    }
}

