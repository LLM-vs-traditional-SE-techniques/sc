import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest24 {

    public static boolean debug = false;

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest24.test25");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray2 = hashCode1.asBytes();
        long long3 = hashCode1.padToLong();
        long long4 = hashCode1.padToLong();
        com.google.common.hash.HashCode hashCode6 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray7 = hashCode6.asBytes();
        long long8 = hashCode6.padToLong();
        long long9 = hashCode6.padToLong();
        byte[] byteArray10 = hashCode6.asBytes();
        com.google.common.hash.HashCode hashCode12 = com.google.common.hash.HashCode.fromLong((long) (short) 100);
        byte[] byteArray13 = hashCode12.asBytes();
        int int16 = hashCode6.writeBytesTo(byteArray13, 8, 0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hashCode1.writeBytesTo(byteArray13, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (97) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 52L + "'", long4 == 52L);
        org.junit.Assert.assertNotNull(hashCode6);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
        org.junit.Assert.assertNotNull(byteArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray10), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(hashCode12);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[100, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }
}

