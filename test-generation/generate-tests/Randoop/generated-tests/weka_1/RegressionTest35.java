import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test36");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector(10);
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector5 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector6 = algVector3.add(algVector5);
        weka.core.AlgVector algVector8 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector9 = algVector3.add(algVector8);
        int int10 = algVector8.numElements();
        weka.core.AlgVector algVector12 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector13 = algVector8.add(algVector12);
        weka.core.AlgVector algVector14 = algVector1.add(algVector12);
        org.junit.Assert.assertNotNull(algVector6);
        org.junit.Assert.assertNotNull(algVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector14);
    }
}

