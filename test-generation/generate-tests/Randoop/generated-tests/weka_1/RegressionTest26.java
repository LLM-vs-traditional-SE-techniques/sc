import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test27");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector4 = algVector1.add(algVector3);
        weka.core.AlgVector algVector6 = new weka.core.AlgVector((int) 'a');
        int int7 = algVector6.numElements();
        weka.core.AlgVector algVector8 = algVector3.add(algVector6);
        weka.core.AlgVector algVector10 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector12 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector13 = algVector10.add(algVector12);
        weka.core.AlgVector algVector15 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector16 = algVector10.add(algVector15);
        weka.core.AlgVector algVector18 = new weka.core.AlgVector(1);
        int int19 = algVector18.numElements();
        weka.core.AlgVector algVector21 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector22 = algVector18.add(algVector21);
        weka.core.AlgVector algVector23 = algVector10.add(algVector21);
        weka.core.AlgVector algVector24 = algVector3.add(algVector10);
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 97 + "'", int7 == 97);
        org.junit.Assert.assertNotNull(algVector8);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(algVector22);
        org.junit.Assert.assertNotNull(algVector23);
        org.junit.Assert.assertNotNull(algVector24);
    }
}

