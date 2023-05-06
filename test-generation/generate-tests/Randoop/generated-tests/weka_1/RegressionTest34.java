import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test35");
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
        weka.core.AlgVector algVector34 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector36 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector37 = algVector34.add(algVector36);
        int int38 = algVector36.numElements();
        weka.core.AlgVector algVector40 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector42 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector43 = algVector40.add(algVector42);
        weka.core.AlgVector algVector45 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector46 = algVector40.add(algVector45);
        weka.core.AlgVector algVector47 = algVector36.add(algVector40);
        int int48 = algVector47.numElements();
        weka.core.AlgVector algVector50 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector52 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector53 = algVector50.add(algVector52);
        weka.core.AlgVector algVector55 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector56 = algVector50.add(algVector55);
        weka.core.AlgVector algVector58 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector60 = new weka.core.AlgVector((int) 'a');
        weka.core.AlgVector algVector61 = algVector58.add(algVector60);
        weka.core.AlgVector algVector63 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector64 = algVector58.add(algVector63);
        weka.core.AlgVector algVector66 = new weka.core.AlgVector(1);
        int int67 = algVector66.numElements();
        weka.core.AlgVector algVector69 = new weka.core.AlgVector(97);
        weka.core.AlgVector algVector70 = algVector66.add(algVector69);
        weka.core.AlgVector algVector71 = algVector58.add(algVector69);
        weka.core.AlgVector algVector72 = algVector56.add(algVector58);
        weka.core.AlgVector algVector73 = algVector47.add(algVector58);
        int int74 = algVector73.numElements();
        weka.core.AlgVector algVector75 = algVector32.add(algVector73);
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
        org.junit.Assert.assertNotNull(algVector37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 97 + "'", int38 == 97);
        org.junit.Assert.assertNotNull(algVector43);
        org.junit.Assert.assertNotNull(algVector46);
        org.junit.Assert.assertNotNull(algVector47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 97 + "'", int48 == 97);
        org.junit.Assert.assertNotNull(algVector53);
        org.junit.Assert.assertNotNull(algVector56);
        org.junit.Assert.assertNotNull(algVector61);
        org.junit.Assert.assertNotNull(algVector64);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(algVector70);
        org.junit.Assert.assertNotNull(algVector71);
        org.junit.Assert.assertNotNull(algVector72);
        org.junit.Assert.assertNotNull(algVector73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 97 + "'", int74 == 97);
        org.junit.Assert.assertNotNull(algVector75);
    }
}

