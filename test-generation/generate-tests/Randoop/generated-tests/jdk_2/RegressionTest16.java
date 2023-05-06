import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest16 {

    public static boolean debug = false;

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest16.test17");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        boolean boolean4 = objList0.contains((java.lang.Object) (short) 1);
        java.util.ArrayList<java.lang.Object> objList5 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean6 = objList0.contains((java.lang.Object) objList5);
        java.lang.Object obj9 = new java.lang.Object();
        java.lang.Object[] objArray14 = new java.lang.Object[] { 100.0f, 0.0f, obj9, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList15 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList15, objArray14);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList17 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean18 = objList15.contains((java.lang.Object) objIterableList17);
        boolean boolean19 = objList5.contains((java.lang.Object) objIterableList17);
        java.lang.Object obj20 = null;
        boolean boolean21 = objList5.contains(obj20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }
}

