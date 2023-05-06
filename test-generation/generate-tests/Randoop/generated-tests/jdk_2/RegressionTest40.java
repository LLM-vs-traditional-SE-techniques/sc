import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest40 {

    public static boolean debug = false;

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest40.test41");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 100.0d, 0.0f, obj2, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        boolean boolean26 = objList23.contains((java.lang.Object) 10.0d);
        boolean boolean28 = objList23.contains((java.lang.Object) 1.0d);
        boolean boolean30 = objList23.contains((java.lang.Object) 0);
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean33 = objList31.contains((java.lang.Object) (-1.0d));
        boolean boolean35 = objList31.contains((java.lang.Object) 100.0d);
        boolean boolean37 = objList31.contains((java.lang.Object) 10L);
        java.lang.Object obj38 = null;
        boolean boolean39 = objList31.contains(obj38);
        java.lang.Object obj42 = new java.lang.Object();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 100.0f, 0.0f, obj42, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList48 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList48, objArray47);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList50 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean51 = objList48.contains((java.lang.Object) objIterableList50);
        boolean boolean52 = objList31.contains((java.lang.Object) objList48);
        boolean boolean53 = objList23.contains((java.lang.Object) objList48);
        boolean boolean55 = objList48.contains((java.lang.Object) (byte) -1);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
    }
}

