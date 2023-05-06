import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test06");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector4 = algVector1.add(algVector3);
        weka.core.AlgVector algVector6 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector8 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector9 = algVector6.add(algVector8);
        int int10 = algVector8.numElements();
        weka.core.AlgVector algVector12 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector14 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector15 = algVector12.add(algVector14);
        weka.core.AlgVector algVector17 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector18 = algVector12.add(algVector17);
        weka.core.AlgVector algVector19 = algVector8.add(algVector12);
        weka.core.AlgVector algVector20 = algVector3.add(algVector8);
        weka.core.AlgVector algVector22 = new weka.core.AlgVector(1);
        int int23 = algVector22.numElements();
        // The following exception was thrown during execution in test generation
        try {
            weka.core.AlgVector algVector24 = algVector8.add(algVector22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertNotNull(algVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(algVector15);
        org.junit.Assert.assertNotNull(algVector18);
        org.junit.Assert.assertNotNull(algVector19);
        org.junit.Assert.assertNotNull(algVector20);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }
}

