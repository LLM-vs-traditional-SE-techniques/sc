import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test28");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 100.0d, 0.0f, obj2, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        boolean boolean26 = objList23.contains((java.lang.Object) 10.0d);
        boolean boolean28 = objList23.contains((java.lang.Object) 1.0d);
        boolean boolean30 = objList23.contains((java.lang.Object) (-1.0f));
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList31 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean32 = objList23.contains((java.lang.Object) strComparableList31);
        java.util.ArrayList<java.lang.Object> objList33 = new java.util.ArrayList<java.lang.Object>();
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean36 = objList34.contains((java.lang.Object) (-1.0d));
        boolean boolean38 = objList34.contains((java.lang.Object) 100.0d);
        boolean boolean40 = objList34.contains((java.lang.Object) 10L);
        boolean boolean42 = objList34.contains((java.lang.Object) 10.0f);
        java.lang.Object obj45 = new java.lang.Object();
        java.lang.Object[] objArray50 = new java.lang.Object[] { 100.0f, 0.0f, obj45, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList51, objArray50);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList53 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean54 = objList51.contains((java.lang.Object) objIterableList53);
        boolean boolean55 = objList34.contains((java.lang.Object) boolean54);
        boolean boolean56 = objList33.contains((java.lang.Object) boolean54);
        java.util.ArrayList<java.lang.Object> objList57 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean59 = objList57.contains((java.lang.Object) (-1.0d));
        boolean boolean61 = objList57.contains((java.lang.Object) 100.0d);
        boolean boolean63 = objList57.contains((java.lang.Object) 0.0d);
        boolean boolean64 = objList33.contains((java.lang.Object) objList57);
        boolean boolean65 = objList23.contains((java.lang.Object) boolean64);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }
}

