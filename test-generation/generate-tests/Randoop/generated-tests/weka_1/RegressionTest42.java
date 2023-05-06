import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

    public static boolean debug = false;

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test43");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) (byte) 0);
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector5 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector6 = algVector3.add(algVector5);
        int int7 = algVector6.numElements();
        weka.core.AlgVector algVector9 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector11 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector12 = algVector9.add(algVector11);
        weka.core.AlgVector algVector14 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector15 = algVector9.add(algVector14);
        weka.core.AlgVector algVector17 = new weka.core.AlgVector(1);
        int int18 = algVector17.numElements();
        weka.core.AlgVector algVector20 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector21 = algVector17.add(algVector20);
        weka.core.AlgVector algVector22 = algVector9.add(algVector20);
        int int23 = algVector20.numElements();
        weka.core.AlgVector algVector24 = algVector6.add(algVector20);
        weka.core.AlgVector algVector25 = algVector1.add(algVector24);
        int int26 = algVector25.numElements();
        org.junit.Assert.assertNotNull(algVector6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(algVector12);
        org.junit.Assert.assertNotNull(algVector15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(algVector21);
        org.junit.Assert.assertNotNull(algVector22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 97 + "'", int23 == 97);
        org.junit.Assert.assertNotNull(algVector24);
        org.junit.Assert.assertNotNull(algVector25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }
}

