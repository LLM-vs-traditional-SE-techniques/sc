import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test42");
        weka.core.AlgVector algVector1 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector3 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector4 = algVector1.add(algVector3);
        weka.core.AlgVector algVector6 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector8 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector9 = algVector6.add(algVector8);
        int int10 = algVector8.numElements();
        weka.core.AlgVector algVector12 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector14 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector15 = algVector12.add(algVector14);
        weka.core.AlgVector algVector17 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector18 = algVector12.add(algVector17);
        weka.core.AlgVector algVector19 = algVector8.add(algVector12);
        weka.core.AlgVector algVector20 = algVector3.add(algVector8);
        weka.core.AlgVector algVector22 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector24 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector25 = algVector22.add(algVector24);
        int int26 = algVector24.numElements();
        weka.core.AlgVector algVector28 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector30 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector31 = algVector28.add(algVector30);
        weka.core.AlgVector algVector33 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector34 = algVector28.add(algVector33);
        weka.core.AlgVector algVector35 = algVector24.add(algVector28);
        int int36 = algVector35.numElements();
        weka.core.AlgVector algVector38 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector40 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector41 = algVector38.add(algVector40);
        weka.core.AlgVector algVector43 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector44 = algVector38.add(algVector43);
        weka.core.AlgVector algVector46 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector48 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector49 = algVector46.add(algVector48);
        weka.core.AlgVector algVector51 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector52 = algVector46.add(algVector51);
        weka.core.AlgVector algVector54 = new weka.core.AlgVector(1);
        int int55 = algVector54.numElements();
        weka.core.AlgVector algVector57 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector58 = algVector54.add(algVector57);
        weka.core.AlgVector algVector59 = algVector46.add(algVector57);
        weka.core.AlgVector algVector60 = algVector44.add(algVector46);
        weka.core.AlgVector algVector61 = algVector35.add(algVector46);
        int int62 = algVector61.numElements();
        int int63 = algVector61.numElements();
        weka.core.AlgVector algVector64 = algVector8.add(algVector61);
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertNotNull(algVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(algVector15);
        org.junit.Assert.assertNotNull(algVector18);
        org.junit.Assert.assertNotNull(algVector19);
        org.junit.Assert.assertNotNull(algVector20);
        org.junit.Assert.assertNotNull(algVector25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 97 + "'", int26 == 97);
        org.junit.Assert.assertNotNull(algVector31);
        org.junit.Assert.assertNotNull(algVector34);
        org.junit.Assert.assertNotNull(algVector35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 97 + "'", int36 == 97);
        org.junit.Assert.assertNotNull(algVector41);
        org.junit.Assert.assertNotNull(algVector44);
        org.junit.Assert.assertNotNull(algVector49);
        org.junit.Assert.assertNotNull(algVector52);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(algVector58);
        org.junit.Assert.assertNotNull(algVector59);
        org.junit.Assert.assertNotNull(algVector60);
        org.junit.Assert.assertNotNull(algVector61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 97 + "'", int63 == 97);
        org.junit.Assert.assertNotNull(algVector64);
    }
}

