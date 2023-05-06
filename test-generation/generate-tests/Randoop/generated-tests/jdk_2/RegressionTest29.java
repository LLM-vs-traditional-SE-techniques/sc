import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test30");
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
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = objList23.contains((java.lang.Object) (-1.0d));
        boolean boolean27 = objList23.contains((java.lang.Object) 100.0d);
        boolean boolean29 = objList23.contains((java.lang.Object) 10L);
        boolean boolean30 = objList20.contains((java.lang.Object) objList23);
        boolean boolean31 = objList8.contains((java.lang.Object) objList20);
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean34 = objList32.contains((java.lang.Object) (-1.0d));
        boolean boolean36 = objList32.contains((java.lang.Object) 100.0d);
        boolean boolean38 = objList32.contains((java.lang.Object) 10L);
        java.lang.Object obj39 = null;
        boolean boolean40 = objList32.contains(obj39);
        boolean boolean41 = objList20.contains(obj39);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }
}

