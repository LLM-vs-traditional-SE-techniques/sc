import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test30");
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
        weka.core.AlgVector algVector17 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector19 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector20 = algVector17.add(algVector19);
        weka.core.AlgVector algVector22 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector23 = algVector17.add(algVector22);
        int int24 = algVector22.numElements();
        weka.core.AlgVector algVector26 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector27 = algVector22.add(algVector26);
        int int28 = algVector22.numElements();
        weka.core.AlgVector algVector29 = algVector12.add(algVector22);
        weka.core.AlgVector algVector31 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector33 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector34 = algVector31.add(algVector33);
        weka.core.AlgVector algVector36 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector37 = algVector31.add(algVector36);
        weka.core.AlgVector algVector39 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector41 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector42 = algVector39.add(algVector41);
        weka.core.AlgVector algVector44 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector45 = algVector39.add(algVector44);
        weka.core.AlgVector algVector47 = new weka.core.AlgVector(1);
        int int48 = algVector47.numElements();
        weka.core.AlgVector algVector50 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector51 = algVector47.add(algVector50);
        weka.core.AlgVector algVector52 = algVector39.add(algVector50);
        weka.core.AlgVector algVector53 = algVector37.add(algVector39);
        weka.core.AlgVector algVector54 = algVector12.add(algVector53);
        weka.core.AlgVector algVector55 = null;
        // The following exception was thrown during execution in test generation
        try {
            weka.core.AlgVector algVector56 = algVector54.add(algVector55);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertNotNull(algVector7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 97 + "'", int15 == 97);
        org.junit.Assert.assertNotNull(algVector20);
        org.junit.Assert.assertNotNull(algVector23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertNotNull(algVector27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 97 + "'", int28 == 97);
        org.junit.Assert.assertNotNull(algVector29);
        org.junit.Assert.assertNotNull(algVector34);
        org.junit.Assert.assertNotNull(algVector37);
        org.junit.Assert.assertNotNull(algVector42);
        org.junit.Assert.assertNotNull(algVector45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(algVector51);
        org.junit.Assert.assertNotNull(algVector52);
        org.junit.Assert.assertNotNull(algVector53);
        org.junit.Assert.assertNotNull(algVector54);
    }
}

