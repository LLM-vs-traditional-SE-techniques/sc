import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test11");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector(0);
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector5 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector6 = algVector3.add(algVector5);
        weka.core.AlgVector algVector8 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector10 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector11 = algVector8.add(algVector10);
        int int12 = algVector10.numElements();
        weka.core.AlgVector algVector14 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector16 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector17 = algVector14.add(algVector16);
        weka.core.AlgVector algVector19 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector20 = algVector14.add(algVector19);
        weka.core.AlgVector algVector21 = algVector10.add(algVector14);
        weka.core.AlgVector algVector22 = algVector5.add(algVector10);
        weka.core.AlgVector algVector23 = algVector1.add(algVector22);
        int int24 = algVector22.numElements();
        org.junit.Assert.assertNotNull(algVector6);
        org.junit.Assert.assertNotNull(algVector11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
        org.junit.Assert.assertNotNull(algVector17);
        org.junit.Assert.assertNotNull(algVector20);
        org.junit.Assert.assertNotNull(algVector21);
        org.junit.Assert.assertNotNull(algVector22);
        org.junit.Assert.assertNotNull(algVector23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
    }
}

