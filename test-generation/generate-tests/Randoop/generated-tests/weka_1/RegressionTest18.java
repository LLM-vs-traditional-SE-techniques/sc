import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest18 {

    public static boolean debug = false;

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest18.test19");
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
        weka.core.AlgVector algVector27 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector29 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector30 = algVector27.add(algVector29);
        weka.core.AlgVector algVector32 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector33 = algVector27.add(algVector32);
        weka.core.AlgVector algVector35 = new weka.core.AlgVector(1);
        int int36 = algVector35.numElements();
        weka.core.AlgVector algVector38 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector39 = algVector35.add(algVector38);
        weka.core.AlgVector algVector40 = algVector27.add(algVector38);
        weka.core.AlgVector algVector41 = algVector25.add(algVector40);
        weka.core.AlgVector algVector42 = null;
        weka.core.AlgVector algVector43 = algVector41.add(algVector42);
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
        org.junit.Assert.assertNotNull(algVector30);
        org.junit.Assert.assertNotNull(algVector33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1 + "'", int36 == 1);
        org.junit.Assert.assertNotNull(algVector39);
        org.junit.Assert.assertNotNull(algVector40);
        org.junit.Assert.assertNotNull(algVector41);
        org.junit.Assert.assertNotNull(algVector43);
    }
}

