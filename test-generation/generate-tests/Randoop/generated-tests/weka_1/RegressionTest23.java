import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test24");
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
        weka.core.AlgVector algVector28 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector30 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector31 = algVector28.add(algVector30);
        int int32 = algVector30.numElements();
        weka.core.AlgVector algVector34 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector36 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector37 = algVector34.add(algVector36);
        weka.core.AlgVector algVector39 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector40 = algVector34.add(algVector39);
        weka.core.AlgVector algVector41 = algVector30.add(algVector34);
        int int42 = algVector41.numElements();
        weka.core.AlgVector algVector44 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector46 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector47 = algVector44.add(algVector46);
        weka.core.AlgVector algVector49 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector50 = algVector44.add(algVector49);
        weka.core.AlgVector algVector52 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector54 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector55 = algVector52.add(algVector54);
        weka.core.AlgVector algVector57 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector58 = algVector52.add(algVector57);
        weka.core.AlgVector algVector60 = new weka.core.AlgVector(1);
        int int61 = algVector60.numElements();
        weka.core.AlgVector algVector63 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector64 = algVector60.add(algVector63);
        weka.core.AlgVector algVector65 = algVector52.add(algVector63);
        weka.core.AlgVector algVector66 = algVector50.add(algVector52);
        weka.core.AlgVector algVector67 = algVector41.add(algVector52);
        weka.core.AlgVector algVector68 = algVector26.add(algVector52);
        weka.core.AlgVector algVector70 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector72 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector73 = algVector70.add(algVector72);
        int int74 = algVector73.numElements();
        weka.core.AlgVector algVector76 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector78 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector79 = algVector76.add(algVector78);
        weka.core.AlgVector algVector81 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector82 = algVector76.add(algVector81);
        weka.core.AlgVector algVector84 = new weka.core.AlgVector(1);
        int int85 = algVector84.numElements();
        weka.core.AlgVector algVector87 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector88 = algVector84.add(algVector87);
        weka.core.AlgVector algVector89 = algVector76.add(algVector87);
        int int90 = algVector87.numElements();
        weka.core.AlgVector algVector91 = algVector73.add(algVector87);
        int int92 = algVector87.numElements();
        weka.core.AlgVector algVector93 = algVector52.add(algVector87);
        org.junit.Assert.assertNotNull(algVector6);
        org.junit.Assert.assertNotNull(algVector9);
        org.junit.Assert.assertNotNull(algVector14);
        org.junit.Assert.assertNotNull(algVector17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(algVector23);
        org.junit.Assert.assertNotNull(algVector24);
        org.junit.Assert.assertNotNull(algVector25);
        org.junit.Assert.assertNotNull(algVector26);
        org.junit.Assert.assertNotNull(algVector31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 97 + "'", int32 == 97);
        org.junit.Assert.assertNotNull(algVector37);
        org.junit.Assert.assertNotNull(algVector40);
        org.junit.Assert.assertNotNull(algVector41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 97 + "'", int42 == 97);
        org.junit.Assert.assertNotNull(algVector47);
        org.junit.Assert.assertNotNull(algVector50);
        org.junit.Assert.assertNotNull(algVector55);
        org.junit.Assert.assertNotNull(algVector58);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(algVector64);
        org.junit.Assert.assertNotNull(algVector65);
        org.junit.Assert.assertNotNull(algVector66);
        org.junit.Assert.assertNotNull(algVector67);
        org.junit.Assert.assertNotNull(algVector68);
        org.junit.Assert.assertNotNull(algVector73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
        org.junit.Assert.assertNotNull(algVector79);
        org.junit.Assert.assertNotNull(algVector82);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 1 + "'", int85 == 1);
        org.junit.Assert.assertNotNull(algVector88);
        org.junit.Assert.assertNotNull(algVector89);
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + 97 + "'", int90 == 97);
        org.junit.Assert.assertNotNull(algVector91);
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 97 + "'", int92 == 97);
        org.junit.Assert.assertNotNull(algVector93);
    }
}

