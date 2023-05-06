import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest36 {

    public static boolean debug = false;

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest36.test37");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        java.util.ArrayList<java.lang.Object> objList3 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean5 = objList3.contains((java.lang.Object) (-1.0d));
        boolean boolean7 = objList3.contains((java.lang.Object) 100.0d);
        boolean boolean9 = objList3.contains((java.lang.Object) 10L);
        boolean boolean10 = objList0.contains((java.lang.Object) objList3);
        java.util.ArrayList<java.lang.Object> objList11 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean13 = objList11.contains((java.lang.Object) (-1.0d));
        boolean boolean15 = objList11.contains((java.lang.Object) 100.0d);
        boolean boolean17 = objList11.contains((java.lang.Object) '#');
        boolean boolean19 = objList11.contains((java.lang.Object) '#');
        boolean boolean21 = objList11.contains((java.lang.Object) (byte) 0);
        boolean boolean23 = objList11.contains((java.lang.Object) '4');
        boolean boolean24 = objList3.contains((java.lang.Object) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

