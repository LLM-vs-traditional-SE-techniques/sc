import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test15");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector4 = algVector1.add(algVector3);
        weka.core.AlgVector algVector6 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector8 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector10 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector11 = algVector8.add(algVector10);
        weka.core.AlgVector algVector13 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector14 = algVector8.add(algVector13);
        weka.core.AlgVector algVector16 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector18 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector19 = algVector16.add(algVector18);
        weka.core.AlgVector algVector21 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector22 = algVector16.add(algVector21);
        weka.core.AlgVector algVector24 = new weka.core.AlgVector(1);
        int int25 = algVector24.numElements();
        weka.core.AlgVector algVector27 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector28 = algVector24.add(algVector27);
        weka.core.AlgVector algVector29 = algVector16.add(algVector27);
        weka.core.AlgVector algVector30 = algVector14.add(algVector16);
        weka.core.AlgVector algVector31 = algVector6.add(algVector14);
        weka.core.AlgVector algVector32 = algVector1.add(algVector14);
        int int33 = algVector32.numElements();
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertNotNull(algVector11);
        org.junit.Assert.assertNotNull(algVector14);
        org.junit.Assert.assertNotNull(algVector19);
        org.junit.Assert.assertNotNull(algVector22);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(algVector28);
        org.junit.Assert.assertNotNull(algVector29);
        org.junit.Assert.assertNotNull(algVector30);
        org.junit.Assert.assertNotNull(algVector31);
        org.junit.Assert.assertNotNull(algVector32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
    }
}

