import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test28");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) (short) 1);
        org.junit.Assert.assertNotNull(hashCode1);
    }
}

