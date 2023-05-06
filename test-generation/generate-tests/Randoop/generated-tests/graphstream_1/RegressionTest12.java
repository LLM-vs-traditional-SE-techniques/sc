import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test13");
        org.graphstream.graph.Path path0 = new org.graphstream.graph.Path();
        org.graphstream.graph.Edge edge1 = null;
        boolean boolean2 = path0.contains(edge1);
        org.graphstream.graph.Edge edge3 = null;
        boolean boolean4 = path0.contains(edge3);
        org.graphstream.graph.Edge edge5 = null;
        boolean boolean6 = path0.contains(edge5);
        org.graphstream.graph.Edge edge7 = null;
        boolean boolean8 = path0.contains(edge7);
        org.graphstream.graph.Edge edge9 = null;
        boolean boolean10 = path0.contains(edge9);
        org.graphstream.graph.Edge edge11 = null;
        boolean boolean12 = path0.contains(edge11);
        org.graphstream.graph.Edge edge13 = null;
        boolean boolean14 = path0.contains(edge13);
        org.graphstream.graph.Edge edge15 = null;
        boolean boolean16 = path0.contains(edge15);
        org.graphstream.graph.Edge edge17 = null;
        boolean boolean18 = path0.contains(edge17);
        org.graphstream.graph.Edge edge19 = null;
        boolean boolean20 = path0.contains(edge19);
        org.graphstream.graph.Edge edge21 = null;
        boolean boolean22 = path0.contains(edge21);
        org.graphstream.graph.Edge edge23 = null;
        boolean boolean24 = path0.contains(edge23);
        // The following exception was thrown during execution in test generation
        try {
            org.graphstream.graph.Edge edge25 = path0.popEdge();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

