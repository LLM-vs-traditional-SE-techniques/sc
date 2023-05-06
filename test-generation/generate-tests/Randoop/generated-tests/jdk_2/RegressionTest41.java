import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest41 {

    public static boolean debug = false;

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest41.test42");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        boolean boolean4 = objList0.contains((java.lang.Object) (short) 1);
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean7 = objList5.contains((java.lang.Object) (-1.0d));
        boolean boolean9 = objList5.contains((java.lang.Object) 100.0d);
        boolean boolean11 = objList5.contains((java.lang.Object) 10L);
        boolean boolean12 = objList0.contains((java.lang.Object) 10L);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 100.0d, 0.0f, obj15, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList36 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList36, objArray35);
        boolean boolean39 = objList36.contains((java.lang.Object) 10.0d);
        boolean boolean41 = objList36.contains((java.lang.Object) 1.0d);
        boolean boolean43 = objList36.contains((java.lang.Object) (-1.0f));
        boolean boolean45 = objList36.contains((java.lang.Object) 1.0f);
        boolean boolean46 = objList0.contains((java.lang.Object) objList36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }
}

