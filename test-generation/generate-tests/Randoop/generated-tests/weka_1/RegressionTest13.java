import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test14");
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
        weka.core.AlgVector algVector36 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector38 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector39 = algVector36.add(algVector38);
        int int40 = algVector38.numElements();
        weka.core.AlgVector algVector42 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector44 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector45 = algVector42.add(algVector44);
        weka.core.AlgVector algVector47 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector48 = algVector42.add(algVector47);
        weka.core.AlgVector algVector49 = algVector38.add(algVector42);
        weka.core.AlgVector algVector50 = algVector33.add(algVector38);
        weka.core.AlgVector algVector52 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector54 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector55 = algVector52.add(algVector54);
        weka.core.AlgVector algVector57 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector59 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector61 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector62 = algVector59.add(algVector61);
        weka.core.AlgVector algVector64 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector65 = algVector59.add(algVector64);
        weka.core.AlgVector algVector67 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector69 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector70 = algVector67.add(algVector69);
        weka.core.AlgVector algVector72 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector73 = algVector67.add(algVector72);
        weka.core.AlgVector algVector75 = new weka.core.AlgVector(1);
        int int76 = algVector75.numElements();
        weka.core.AlgVector algVector78 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector79 = algVector75.add(algVector78);
        weka.core.AlgVector algVector80 = algVector67.add(algVector78);
        weka.core.AlgVector algVector81 = algVector65.add(algVector67);
        weka.core.AlgVector algVector82 = algVector57.add(algVector65);
        weka.core.AlgVector algVector83 = algVector52.add(algVector65);
        weka.core.AlgVector algVector84 = algVector38.add(algVector52);
        weka.core.AlgVector algVector85 = algVector29.add(algVector38);
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
        org.junit.Assert.assertNotNull(algVector39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 97 + "'", int40 == 97);
        org.junit.Assert.assertNotNull(algVector45);
        org.junit.Assert.assertNotNull(algVector48);
        org.junit.Assert.assertNotNull(algVector49);
        org.junit.Assert.assertNotNull(algVector50);
        org.junit.Assert.assertNotNull(algVector55);
        org.junit.Assert.assertNotNull(algVector62);
        org.junit.Assert.assertNotNull(algVector65);
        org.junit.Assert.assertNotNull(algVector70);
        org.junit.Assert.assertNotNull(algVector73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 1 + "'", int76 == 1);
        org.junit.Assert.assertNotNull(algVector79);
        org.junit.Assert.assertNotNull(algVector80);
        org.junit.Assert.assertNotNull(algVector81);
        org.junit.Assert.assertNotNull(algVector82);
        org.junit.Assert.assertNotNull(algVector83);
        org.junit.Assert.assertNotNull(algVector84);
        org.junit.Assert.assertNotNull(algVector85);
    }
}

