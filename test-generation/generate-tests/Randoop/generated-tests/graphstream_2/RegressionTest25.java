import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest25 {

    public static boolean debug = false;

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest25.test26");
        org.graphstream.graph.Path path0 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path1 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path2 = new org.graphstream.graph.Path();
        boolean boolean3 = path1.equals(path2);
        boolean boolean4 = path0.equals(path1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }
}

