import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest6 {

    public static boolean debug = false;

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test07");
        org.graphstream.graph.Path path0 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path1 = new org.graphstream.graph.Path();
        boolean boolean2 = path0.equals(path1);
        org.graphstream.graph.Path path3 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path4 = new org.graphstream.graph.Path();
        boolean boolean5 = path3.equals(path4);
        org.graphstream.graph.Path path6 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path7 = new org.graphstream.graph.Path();
        boolean boolean8 = path6.equals(path7);
        boolean boolean9 = path3.equals(path7);
        org.graphstream.graph.Path path10 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path11 = new org.graphstream.graph.Path();
        boolean boolean12 = path10.equals(path11);
        org.graphstream.graph.Path path13 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path14 = new org.graphstream.graph.Path();
        boolean boolean15 = path13.equals(path14);
        boolean boolean16 = path10.equals(path14);
        boolean boolean17 = path3.equals(path10);
        boolean boolean18 = path1.equals(path3);
        org.graphstream.graph.Path path19 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path20 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path21 = new org.graphstream.graph.Path();
        boolean boolean22 = path20.equals(path21);
        org.graphstream.graph.Path path23 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path24 = new org.graphstream.graph.Path();
        boolean boolean25 = path23.equals(path24);
        org.graphstream.graph.Path path26 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path27 = new org.graphstream.graph.Path();
        boolean boolean28 = path26.equals(path27);
        boolean boolean29 = path23.equals(path27);
        org.graphstream.graph.Path path30 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path31 = new org.graphstream.graph.Path();
        boolean boolean32 = path30.equals(path31);
        org.graphstream.graph.Path path33 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path34 = new org.graphstream.graph.Path();
        boolean boolean35 = path33.equals(path34);
        boolean boolean36 = path30.equals(path34);
        boolean boolean37 = path23.equals(path30);
        boolean boolean38 = path21.equals(path30);
        boolean boolean39 = path19.equals(path21);
        org.graphstream.graph.Path path40 = new org.graphstream.graph.Path();
        boolean boolean41 = path21.equals(path40);
        boolean boolean42 = path3.equals(path21);
        org.graphstream.graph.Path path43 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean44 = path21.equals(path43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }
}

