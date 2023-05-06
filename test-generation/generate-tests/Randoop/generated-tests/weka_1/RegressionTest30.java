import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test31");
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
        int int15 = algVector12.numElements();
        weka.core.AlgVector algVector17 = new weka.core.AlgVector(1);
        int int18 = algVector17.numElements();
        weka.core.AlgVector algVector20 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector21 = algVector17.add(algVector20);
        int int22 = algVector20.numElements();
        weka.core.AlgVector algVector23 = algVector12.add(algVector20);
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertNotNull(algVector7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(algVector21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertNotNull(algVector23);
    }
}

