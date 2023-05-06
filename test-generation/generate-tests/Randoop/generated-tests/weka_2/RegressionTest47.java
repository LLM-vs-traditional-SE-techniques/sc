import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest47 {

    public static boolean debug = false;

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest47.test48");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) (short) 10);
        int int2 = algVector1.numElements();
        weka.core.Instances instances3 = null;
        java.util.Random random4 = new java.util.Random();
        // The following exception was thrown during execution in test generation
        try {
            weka.core.Instance instance5 = algVector1.getAsInstance(instances3, random4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 10 + "'", int2 == 10);
    }
}

