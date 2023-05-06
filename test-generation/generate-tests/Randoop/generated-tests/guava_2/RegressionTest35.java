import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test36");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) ' ');
        com.google.common.hash.HashCode hashCode3 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray4 = hashCode3.asBytes();
        long long5 = hashCode3.padToLong();
        byte[] byteArray6 = hashCode3.asBytes();
        long long7 = hashCode3.padToLong();
        int int8 = hashCode3.asInt();
        byte[] byteArray9 = hashCode3.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashCode1.writeBytesTo(byteArray9, (int) (byte) 1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: end index (9) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertNotNull(hashCode3);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[52, 0, 0, 0, 0, 0, 0, 0]");
    }
}

