import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test13");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) 100);
        com.google.common.hash.HashCode hashCode3 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray4 = hashCode3.asBytes();
        long long5 = hashCode3.padToLong();
        long long6 = hashCode3.padToLong();
        byte[] byteArray7 = hashCode3.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashCode1.writeBytesTo(byteArray7, (-1), 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (-1) must not be negative");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertNotNull(hashCode3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[52, 0, 0, 0, 0, 0, 0, 0]");
    }
}

