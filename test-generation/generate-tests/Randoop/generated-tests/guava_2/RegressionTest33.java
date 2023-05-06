import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest33 {

    public static boolean debug = false;

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest33.test34");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) (short) 100);
        byte[] byteArray2 = hashCode1.asBytes();
        com.google.common.hash.HashCode hashCode4 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray5 = hashCode4.asBytes();
        long long6 = hashCode4.padToLong();
        long long7 = hashCode4.padToLong();
        byte[] byteArray8 = hashCode4.asBytes();
        long long9 = hashCode4.padToLong();
        byte[] byteArray10 = hashCode4.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashCode1.writeBytesTo(byteArray10, (int) (byte) 100, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (100) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[100, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(hashCode4);
        org.junit.Assert.assertNotNull(byteArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray5), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 52L + "'", long6 == 52L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[52, 0, 0, 0, 0, 0, 0, 0]");
    }
}

