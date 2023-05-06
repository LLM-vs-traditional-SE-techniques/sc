import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test39");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector3 = new weka.core.AlgVector(1);
        int int4 = algVector3.numElements();
        weka.core.AlgVector algVector6 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector7 = algVector3.add(algVector6);
        weka.core.AlgVector algVector8 = algVector1.add(algVector6);
        weka.core.AlgVector algVector10 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector12 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector13 = algVector10.add(algVector12);
        weka.core.AlgVector algVector15 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector16 = algVector10.add(algVector15);
        weka.core.AlgVector algVector17 = algVector8.add(algVector10);
        weka.core.AlgVector algVector19 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector21 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector23 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector24 = algVector21.add(algVector23);
        weka.core.AlgVector algVector26 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector27 = algVector21.add(algVector26);
        weka.core.AlgVector algVector29 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector31 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector32 = algVector29.add(algVector31);
        weka.core.AlgVector algVector34 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector35 = algVector29.add(algVector34);
        weka.core.AlgVector algVector37 = new weka.core.AlgVector(1);
        int int38 = algVector37.numElements();
        weka.core.AlgVector algVector40 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector41 = algVector37.add(algVector40);
        weka.core.AlgVector algVector42 = algVector29.add(algVector40);
        weka.core.AlgVector algVector43 = algVector27.add(algVector29);
        weka.core.AlgVector algVector44 = algVector19.add(algVector27);
        weka.core.AlgVector algVector46 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector48 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector49 = algVector46.add(algVector48);
        int int50 = algVector48.numElements();
        weka.core.AlgVector algVector52 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector54 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector55 = algVector52.add(algVector54);
        weka.core.AlgVector algVector57 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector58 = algVector52.add(algVector57);
        weka.core.AlgVector algVector59 = algVector48.add(algVector52);
        int int60 = algVector59.numElements();
        weka.core.AlgVector algVector62 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector64 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector65 = algVector62.add(algVector64);
        weka.core.AlgVector algVector67 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector68 = algVector62.add(algVector67);
        weka.core.AlgVector algVector70 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector72 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector73 = algVector70.add(algVector72);
        weka.core.AlgVector algVector75 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector76 = algVector70.add(algVector75);
        weka.core.AlgVector algVector78 = new weka.core.AlgVector(1);
        int int79 = algVector78.numElements();
        weka.core.AlgVector algVector81 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector82 = algVector78.add(algVector81);
        weka.core.AlgVector algVector83 = algVector70.add(algVector81);
        weka.core.AlgVector algVector84 = algVector68.add(algVector70);
        weka.core.AlgVector algVector85 = algVector59.add(algVector70);
        weka.core.AlgVector algVector86 = algVector44.add(algVector70);
        weka.core.AlgVector algVector88 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector89 = algVector70.add(algVector88);
        weka.core.AlgVector algVector90 = algVector8.add(algVector88);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(algVector7);
        org.junit.Assert.assertNotNull(algVector8);
        org.junit.Assert.assertNotNull(algVector13);
        org.junit.Assert.assertNotNull(algVector16);
        org.junit.Assert.assertNotNull(algVector17);
        org.junit.Assert.assertNotNull(algVector24);
        org.junit.Assert.assertNotNull(algVector27);
        org.junit.Assert.assertNotNull(algVector32);
        org.junit.Assert.assertNotNull(algVector35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(algVector41);
        org.junit.Assert.assertNotNull(algVector42);
        org.junit.Assert.assertNotNull(algVector43);
        org.junit.Assert.assertNotNull(algVector44);
        org.junit.Assert.assertNotNull(algVector49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 97 + "'", int50 == 97);
        org.junit.Assert.assertNotNull(algVector55);
        org.junit.Assert.assertNotNull(algVector58);
        org.junit.Assert.assertNotNull(algVector59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 97 + "'", int60 == 97);
        org.junit.Assert.assertNotNull(algVector65);
        org.junit.Assert.assertNotNull(algVector68);
        org.junit.Assert.assertNotNull(algVector73);
        org.junit.Assert.assertNotNull(algVector76);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 1 + "'", int79 == 1);
        org.junit.Assert.assertNotNull(algVector82);
        org.junit.Assert.assertNotNull(algVector83);
        org.junit.Assert.assertNotNull(algVector84);
        org.junit.Assert.assertNotNull(algVector85);
        org.junit.Assert.assertNotNull(algVector86);
        org.junit.Assert.assertNotNull(algVector89);
        org.junit.Assert.assertNotNull(algVector90);
    }
}

