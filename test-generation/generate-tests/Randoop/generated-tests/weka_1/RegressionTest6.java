import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test07");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector5 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector6 = algVector3.add(algVector5);
        weka.core.AlgVector algVector8 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector9 = algVector3.add(algVector8);
        weka.core.AlgVector algVector11 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector13 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector14 = algVector11.add(algVector13);
        weka.core.AlgVector algVector16 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector17 = algVector11.add(algVector16);
        weka.core.AlgVector algVector19 = new weka.core.AlgVector(1);
        int int20 = algVector19.numElements();
        weka.core.AlgVector algVector22 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector23 = algVector19.add(algVector22);
        weka.core.AlgVector algVector24 = algVector11.add(algVector22);
        weka.core.AlgVector algVector25 = algVector9.add(algVector11);
        weka.core.AlgVector algVector26 = algVector1.add(algVector9);
        int int27 = algVector1.numElements();
        org.junit.Assert.assertNotNull(algVector6);
        org.junit.Assert.assertNotNull(algVector9);
        org.junit.Assert.assertNotNull(algVector14);
        org.junit.Assert.assertNotNull(algVector17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(algVector23);
        org.junit.Assert.assertNotNull(algVector24);
        org.junit.Assert.assertNotNull(algVector25);
        org.junit.Assert.assertNotNull(algVector26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 97 + "'", int27 == 97);
    }
}

