import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest42 {

    public static boolean debug = false;

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest42.test43");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, 0.0f, obj2, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList8 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList8, objArray7);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList10 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean11 = objList8.contains((java.lang.Object) objIterableList10);
        java.util.ArrayList<java.lang.Object> objList12 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean14 = objList12.contains((java.lang.Object) (-1.0d));
        boolean boolean16 = objList12.contains((java.lang.Object) 100.0d);
        java.lang.Object obj17 = new java.lang.Object();
        boolean boolean18 = objList12.contains(obj17);
        boolean boolean19 = objList8.contains((java.lang.Object) boolean18);
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = objList20.contains((java.lang.Object) (-1.0d));
        boolean boolean24 = objList20.contains((java.lang.Object) 100.0d);
        boolean boolean26 = objList20.contains((java.lang.Object) 10L);
        boolean boolean28 = objList20.contains((java.lang.Object) 10.0f);
        java.lang.Object obj31 = new java.lang.Object();
        java.lang.Object[] objArray36 = new java.lang.Object[] { 100.0f, 0.0f, obj31, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList37 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList37, objArray36);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList39 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean40 = objList37.contains((java.lang.Object) objIterableList39);
        boolean boolean41 = objList20.contains((java.lang.Object) boolean40);
        boolean boolean42 = objList8.contains((java.lang.Object) boolean40);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }
}

