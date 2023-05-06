import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest43 {

    public static boolean debug = false;

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest43.test44");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        boolean boolean4 = objList0.contains((java.lang.Object) 100.0d);
        boolean boolean6 = objList0.contains((java.lang.Object) 10L);
        boolean boolean8 = objList0.contains((java.lang.Object) 10.0f);
        java.lang.Object obj11 = new java.lang.Object();
        java.lang.Object[] objArray16 = new java.lang.Object[] { 100.0f, 0.0f, obj11, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList17 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList17, objArray16);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList19 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean20 = objList17.contains((java.lang.Object) objIterableList19);
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean23 = objList21.contains((java.lang.Object) (-1.0d));
        boolean boolean25 = objList21.contains((java.lang.Object) 100.0d);
        java.lang.Object obj26 = new java.lang.Object();
        boolean boolean27 = objList21.contains(obj26);
        boolean boolean28 = objList17.contains((java.lang.Object) boolean27);
        java.util.ArrayList<java.lang.Object> objList29 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean31 = objList29.contains((java.lang.Object) (-1.0d));
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean34 = objList32.contains((java.lang.Object) (-1.0d));
        boolean boolean36 = objList32.contains((java.lang.Object) 100.0d);
        boolean boolean38 = objList32.contains((java.lang.Object) 10L);
        boolean boolean39 = objList29.contains((java.lang.Object) objList32);
        boolean boolean40 = objList17.contains((java.lang.Object) objList29);
        boolean boolean41 = objList0.contains((java.lang.Object) objList17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }
}

