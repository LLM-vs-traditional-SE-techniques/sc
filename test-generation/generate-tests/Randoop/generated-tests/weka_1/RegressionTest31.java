import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test32");
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
        int int15 = algVector14.numElements();
        weka.core.AlgVector algVector17 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector19 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector20 = algVector17.add(algVector19);
        weka.core.AlgVector algVector22 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector23 = algVector17.add(algVector22);
        int int24 = algVector22.numElements();
        weka.core.AlgVector algVector26 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector27 = algVector22.add(algVector26);
        int int28 = algVector22.numElements();
        weka.core.AlgVector algVector29 = algVector14.add(algVector22);
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 97 + "'", int5 == 97);
        org.junit.Assert.assertNotNull(algVector10);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(algVector20);
        org.junit.Assert.assertNotNull(algVector23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(algVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(algVector29);
    }
}

