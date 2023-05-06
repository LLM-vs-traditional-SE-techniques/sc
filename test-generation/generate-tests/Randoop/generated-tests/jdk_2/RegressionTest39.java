import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest39 {

    public static boolean debug = false;

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest39.test40");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        boolean boolean4 = objList0.contains((java.lang.Object) 100.0d);
        boolean boolean6 = objList0.contains((java.lang.Object) 10L);
        boolean boolean8 = objList0.contains((java.lang.Object) 10.0f);
        java.util.ArrayList<java.util.Collection<java.lang.Object>> objCollectionList9 = new java.util.ArrayList<java.util.Collection<java.lang.Object>>();
        boolean boolean10 = objList0.contains((java.lang.Object) objCollectionList9);
        java.lang.Object obj11 = null;
        boolean boolean12 = objList0.contains(obj11);
        java.lang.Object obj15 = new java.lang.Object();
        java.lang.Object[] objArray20 = new java.lang.Object[] { 100.0f, 0.0f, obj15, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList21 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList21, objArray20);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList23 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean24 = objList21.contains((java.lang.Object) objIterableList23);
        boolean boolean25 = objList0.contains((java.lang.Object) boolean24);
        java.util.ArrayList<java.lang.Object> objList26 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean28 = objList26.contains((java.lang.Object) (-1.0d));
        boolean boolean30 = objList26.contains((java.lang.Object) (short) 1);
        java.util.ArrayList<java.lang.Object> objList31 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean32 = objList26.contains((java.lang.Object) objList31);
        java.lang.Object obj33 = null;
        boolean boolean34 = objList26.contains(obj33);
        boolean boolean35 = objList0.contains((java.lang.Object) objList26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
    }
}

