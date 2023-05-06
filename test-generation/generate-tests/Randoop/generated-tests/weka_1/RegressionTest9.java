import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test10");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector4 = algVector1.add(algVector3);
        weka.core.AlgVector algVector6 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector7 = algVector1.add(algVector6);
        weka.core.AlgVector algVector9 = new weka.core.AlgVector(1);
        int int10 = algVector9.numElements();
        weka.core.AlgVector algVector12 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector13 = algVector9.add(algVector12);
        weka.core.AlgVector algVector14 = algVector1.add(algVector12);
        weka.core.AlgVector algVector15 = null;
        // The following exception was thrown during execution in test generation
        try {
            weka.core.AlgVector algVector16 = algVector14.add(algVector15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertNotNull(algVector7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector14);
    }
}

