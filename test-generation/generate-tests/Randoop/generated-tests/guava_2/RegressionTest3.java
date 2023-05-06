import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test04");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray2 = hashCode1.asBytes();
        long long3 = hashCode1.padToLong();
        com.google.common.hash.HashCode hashCode5 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray6 = hashCode5.asBytes();
        long long7 = hashCode5.padToLong();
        long long8 = hashCode5.padToLong();
        byte[] byteArray9 = hashCode5.asBytes();
        long long10 = hashCode5.padToLong();
        byte[] byteArray11 = hashCode5.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashCode1.writeBytesTo(byteArray11, (int) (short) 10, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (10) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(hashCode5);
        org.junit.Assert.assertNotNull(byteArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray6), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 52L + "'", long8 == 52L);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[52, 0, 0, 0, 0, 0, 0, 0]");
    }
}

