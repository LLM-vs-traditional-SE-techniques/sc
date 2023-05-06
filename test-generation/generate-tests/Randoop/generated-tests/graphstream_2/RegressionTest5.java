import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest5.test06");
        org.graphstream.graph.Path path0 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path1 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path2 = new org.graphstream.graph.Path();
        boolean boolean3 = path1.equals(path2);
        org.graphstream.graph.Path path4 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path5 = new org.graphstream.graph.Path();
        boolean boolean6 = path4.equals(path5);
        boolean boolean7 = path1.equals(path5);
        org.graphstream.graph.Path path8 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path9 = new org.graphstream.graph.Path();
        boolean boolean10 = path8.equals(path9);
        org.graphstream.graph.Path path11 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path12 = new org.graphstream.graph.Path();
        boolean boolean13 = path11.equals(path12);
        boolean boolean14 = path8.equals(path12);
        boolean boolean15 = path1.equals(path8);
        boolean boolean16 = path0.equals(path1);
        org.graphstream.graph.Path path17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = path0.equals(path17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }
}

