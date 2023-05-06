import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test32");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray2 = hashCode1.asBytes();
        long long3 = hashCode1.padToLong();
        byte[] byteArray4 = hashCode1.asBytes();
        long long5 = hashCode1.padToLong();
        int int6 = hashCode1.asInt();
        byte[] byteArray7 = hashCode1.asBytes();
        byte[] byteArray8 = hashCode1.asBytes();
        com.google.common.hash.HashCode hashCode10 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray11 = hashCode10.asBytes();
        long long12 = hashCode10.padToLong();
        int int13 = hashCode10.asInt();
        byte[] byteArray14 = hashCode10.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashCode1.writeBytesTo(byteArray14, (int) '#', (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (35) must not be greater than size (8)");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hashCode1);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 52L + "'", long3 == 52L);
        org.junit.Assert.assertNotNull(byteArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray4), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 52L + "'", long5 == 52L);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(byteArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray7), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray8), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(hashCode10);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[52, 0, 0, 0, 0, 0, 0, 0]");
    }
}

