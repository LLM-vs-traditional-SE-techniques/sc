import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest44 {

    public static boolean debug = false;

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest44.test45");
        com.google.common.hash.HashCode hashCode1 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray2 = hashCode1.asBytes();
        long long3 = hashCode1.padToLong();
        byte[] byteArray4 = hashCode1.asBytes();
        long long5 = hashCode1.padToLong();
        int int6 = hashCode1.asInt();
        com.google.common.hash.HashCode hashCode8 = com.google.common.hash.HashCode.fromLong((long) '4');
        byte[] byteArray9 = hashCode8.asBytes();
        long long10 = hashCode8.padToLong();
        byte[] byteArray11 = hashCode8.asBytes();
        long long12 = hashCode8.padToLong();
        byte[] byteArray13 = hashCode8.asBytes();
        byte[] byteArray14 = hashCode8.asBytes();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashCode1.writeBytesTo(byteArray14, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: start index (100) must not be greater than size (8)");
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
        org.junit.Assert.assertNotNull(hashCode8);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertNotNull(byteArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray11), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[52, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(byteArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray14), "[52, 0, 0, 0, 0, 0, 0, 0]");
    }
}

