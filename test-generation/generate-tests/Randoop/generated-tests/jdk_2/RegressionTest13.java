import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest13 {

    public static boolean debug = false;

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test14");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        boolean boolean4 = objList0.contains((java.lang.Object) 100.0d);
        boolean boolean6 = objList0.contains((java.lang.Object) 0.0d);
        boolean boolean8 = objList0.contains((java.lang.Object) 10);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 100.0d, 0.0f, obj11, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList32, objArray31);
        boolean boolean35 = objList32.contains((java.lang.Object) 10.0d);
        boolean boolean37 = objList32.contains((java.lang.Object) 1.0d);
        boolean boolean38 = objList0.contains((java.lang.Object) boolean37);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }
}

