import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest15 {

    public static boolean debug = false;

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest15.test16");
        org.graphstream.graph.Path path0 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path1 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path2 = new org.graphstream.graph.Path();
        boolean boolean3 = path1.equals(path2);
        org.graphstream.graph.Path path4 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path5 = new org.graphstream.graph.Path();
        boolean boolean6 = path4.equals(path5);
        org.graphstream.graph.Path path7 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path8 = new org.graphstream.graph.Path();
        boolean boolean9 = path7.equals(path8);
        boolean boolean10 = path4.equals(path8);
        org.graphstream.graph.Path path11 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path12 = new org.graphstream.graph.Path();
        boolean boolean13 = path11.equals(path12);
        org.graphstream.graph.Path path14 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path15 = new org.graphstream.graph.Path();
        boolean boolean16 = path14.equals(path15);
        boolean boolean17 = path11.equals(path15);
        boolean boolean18 = path4.equals(path11);
        boolean boolean19 = path2.equals(path11);
        boolean boolean20 = path0.equals(path2);
        org.graphstream.graph.Path path21 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path22 = new org.graphstream.graph.Path();
        boolean boolean23 = path21.equals(path22);
        org.graphstream.graph.Path path24 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path25 = new org.graphstream.graph.Path();
        boolean boolean26 = path24.equals(path25);
        boolean boolean27 = path21.equals(path25);
        org.graphstream.graph.Path path28 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path29 = new org.graphstream.graph.Path();
        boolean boolean30 = path28.equals(path29);
        org.graphstream.graph.Path path31 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path32 = new org.graphstream.graph.Path();
        boolean boolean33 = path31.equals(path32);
        boolean boolean34 = path28.equals(path32);
        boolean boolean35 = path25.equals(path32);
        boolean boolean36 = path0.equals(path25);
        org.graphstream.graph.Path path37 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path38 = new org.graphstream.graph.Path();
        boolean boolean39 = path37.equals(path38);
        boolean boolean40 = path0.equals(path38);
        org.graphstream.graph.Path path41 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path42 = new org.graphstream.graph.Path();
        boolean boolean43 = path41.equals(path42);
        org.graphstream.graph.Path path44 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path45 = new org.graphstream.graph.Path();
        boolean boolean46 = path44.equals(path45);
        boolean boolean47 = path41.equals(path45);
        org.graphstream.graph.Path path48 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path49 = new org.graphstream.graph.Path();
        boolean boolean50 = path48.equals(path49);
        boolean boolean51 = path41.equals(path48);
        org.graphstream.graph.Path path52 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path53 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path54 = new org.graphstream.graph.Path();
        boolean boolean55 = path53.equals(path54);
        org.graphstream.graph.Path path56 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path57 = new org.graphstream.graph.Path();
        boolean boolean58 = path56.equals(path57);
        org.graphstream.graph.Path path59 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path60 = new org.graphstream.graph.Path();
        boolean boolean61 = path59.equals(path60);
        boolean boolean62 = path56.equals(path60);
        org.graphstream.graph.Path path63 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path64 = new org.graphstream.graph.Path();
        boolean boolean65 = path63.equals(path64);
        org.graphstream.graph.Path path66 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path67 = new org.graphstream.graph.Path();
        boolean boolean68 = path66.equals(path67);
        boolean boolean69 = path63.equals(path67);
        boolean boolean70 = path56.equals(path63);
        boolean boolean71 = path54.equals(path63);
        boolean boolean72 = path52.equals(path54);
        org.graphstream.graph.Path path73 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path74 = new org.graphstream.graph.Path();
        boolean boolean75 = path73.equals(path74);
        org.graphstream.graph.Path path76 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path77 = new org.graphstream.graph.Path();
        boolean boolean78 = path76.equals(path77);
        boolean boolean79 = path73.equals(path77);
        org.graphstream.graph.Path path80 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path81 = new org.graphstream.graph.Path();
        boolean boolean82 = path80.equals(path81);
        org.graphstream.graph.Path path83 = new org.graphstream.graph.Path();
        org.graphstream.graph.Path path84 = new org.graphstream.graph.Path();
        boolean boolean85 = path83.equals(path84);
        boolean boolean86 = path80.equals(path84);
        boolean boolean87 = path77.equals(path84);
        boolean boolean88 = path52.equals(path77);
        boolean boolean89 = path41.equals(path77);
        boolean boolean90 = path38.equals(path77);
        org.graphstream.graph.Path path91 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean92 = path77.equals(path91);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
    }
}

