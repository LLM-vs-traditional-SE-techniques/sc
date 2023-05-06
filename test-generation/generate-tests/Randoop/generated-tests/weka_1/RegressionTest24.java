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
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector4 = algVector1.add(algVector3);
        int int5 = algVector3.numElements();
        weka.core.AlgVector algVector7 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector9 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector10 = algVector7.add(algVector9);
        weka.core.AlgVector algVector12 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector13 = algVector7.add(algVector12);
        weka.core.AlgVector algVector14 = algVector3.add(algVector7);
        int int15 = algVector3.numElements();
        weka.core.AlgVector algVector16 = null;
        // The following exception was thrown during execution in test generation
        try {
            weka.core.AlgVector algVector17 = algVector3.add(algVector16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(algVector10);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
    }
}

