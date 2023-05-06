import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test05");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) (byte) 10);
        weka.core.AlgVector algVector3 = new weka.core.AlgVector(1);
        int int4 = algVector3.numElements();
        // The following exception was thrown during execution in test generation
        try {
            weka.core.AlgVector algVector5 = algVector1.add(algVector3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }
}

