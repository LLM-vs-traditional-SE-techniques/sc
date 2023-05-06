import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        int int2 = algVector1.numElements();
        weka.core.AlgVector algVector3 = null;
        // The following exception was thrown during execution in test generation
        try {
            weka.core.AlgVector algVector4 = algVector1.add(algVector3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 97 + "'", int2 == 97);
    }
}

