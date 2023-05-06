import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test41");
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
        weka.core.AlgVector algVector27 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector29 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector31 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector32 = algVector29.add(algVector31);
        weka.core.AlgVector algVector34 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector35 = algVector29.add(algVector34);
        weka.core.AlgVector algVector37 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector39 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector40 = algVector37.add(algVector39);
        weka.core.AlgVector algVector42 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector43 = algVector37.add(algVector42);
        weka.core.AlgVector algVector45 = new weka.core.AlgVector(1);
        int int46 = algVector45.numElements();
        weka.core.AlgVector algVector48 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector49 = algVector45.add(algVector48);
        weka.core.AlgVector algVector50 = algVector37.add(algVector48);
        weka.core.AlgVector algVector51 = algVector35.add(algVector37);
        weka.core.AlgVector algVector52 = algVector27.add(algVector35);
        weka.core.AlgVector algVector53 = algVector22.add(algVector35);
        weka.core.AlgVector algVector54 = algVector8.add(algVector22);
        weka.core.AlgVector algVector56 = new weka.core.AlgVector((int) (byte) 100);
        weka.core.AlgVector algVector57 = algVector8.add(algVector56);
        org.junit.Assert.assertNotNull(algVector4);
        org.junit.Assert.assertNotNull(algVector9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertNotNull(algVector15);
        org.junit.Assert.assertNotNull(algVector18);
        org.junit.Assert.assertNotNull(algVector19);
        org.junit.Assert.assertNotNull(algVector20);
        org.junit.Assert.assertNotNull(algVector25);
        org.junit.Assert.assertNotNull(algVector32);
        org.junit.Assert.assertNotNull(algVector35);
        org.junit.Assert.assertNotNull(algVector40);
        org.junit.Assert.assertNotNull(algVector43);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1 + "'", int46 == 1);
        org.junit.Assert.assertNotNull(algVector49);
        org.junit.Assert.assertNotNull(algVector50);
        org.junit.Assert.assertNotNull(algVector51);
        org.junit.Assert.assertNotNull(algVector52);
        org.junit.Assert.assertNotNull(algVector53);
        org.junit.Assert.assertNotNull(algVector54);
        org.junit.Assert.assertNotNull(algVector57);
    }
}

