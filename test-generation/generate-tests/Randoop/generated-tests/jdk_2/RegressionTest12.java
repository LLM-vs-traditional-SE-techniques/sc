import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest12 {

    public static boolean debug = false;

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest12.test13");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray7 = new java.lang.Object[] { 100.0f, 0.0f, obj2, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList8 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList8, objArray7);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList10 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean11 = objList8.contains((java.lang.Object) objIterableList10);
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] objArray19 = new java.lang.Object[] { 100.0f, 0.0f, obj14, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList20 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList20, objArray19);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList22 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean23 = objList20.contains((java.lang.Object) objIterableList22);
        boolean boolean24 = objList8.contains((java.lang.Object) objList20);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }
}

