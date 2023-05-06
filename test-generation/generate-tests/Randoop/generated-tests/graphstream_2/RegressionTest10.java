import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test11");
        org.graphstream.graph.Path path0 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path1 = new org.graphstream.graph.Path();
        boolean boolean2 = path0.equals(path1);
        org.graphstream.graph.Path path3 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path4 = new org.graphstream.graph.Path();
        boolean boolean5 = path3.equals(path4);
        boolean boolean6 = path0.equals(path4);
        org.graphstream.graph.Path path7 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path8 = new org.graphstream.graph.Path();
        boolean boolean9 = path7.equals(path8);
        org.graphstream.graph.Path path10 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path11 = new org.graphstream.graph.Path();
        boolean boolean12 = path10.equals(path11);
        org.graphstream.graph.Path path13 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path14 = new org.graphstream.graph.Path();
        boolean boolean15 = path13.equals(path14);
        boolean boolean16 = path10.equals(path14);
        org.graphstream.graph.Path path17 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path18 = new org.graphstream.graph.Path();
        boolean boolean19 = path17.equals(path18);
        org.graphstream.graph.Path path20 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path21 = new org.graphstream.graph.Path();
        boolean boolean22 = path20.equals(path21);
        boolean boolean23 = path17.equals(path21);
        boolean boolean24 = path10.equals(path17);
        boolean boolean25 = path8.equals(path17);
        boolean boolean26 = path0.equals(path8);
        org.graphstream.graph.Path path27 = new org.graphstream.graph.Path();
        boolean boolean28 = path8.equals(path27);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }
}

