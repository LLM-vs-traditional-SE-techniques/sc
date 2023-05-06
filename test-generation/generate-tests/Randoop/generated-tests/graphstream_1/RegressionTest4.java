import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest4 {

    public static boolean debug = false;

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test05");
        org.graphstream.graph.Path path0 = new org.graphstream.graph.Path();
        org.graphstream.graph.Edge edge1 = null;
        boolean boolean2 = path0.contains(edge1);
        org.graphstream.graph.Edge edge3 = null;
        boolean boolean4 = path0.contains(edge3);
        org.graphstream.graph.Edge edge5 = null;
        boolean boolean6 = path0.contains(edge5);
        org.graphstream.graph.Edge edge7 = null;
        boolean boolean8 = path0.contains(edge7);
        // The following exception was thrown during execution in test generation
        try {
            org.graphstream.graph.Edge edge9 = path0.popEdge();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException; message: null");
        } catch (java.util.EmptyStackException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }
}

