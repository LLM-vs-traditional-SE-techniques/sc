import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test31");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        boolean boolean4 = objList0.contains((java.lang.Object) 100.0d);
        boolean boolean6 = objList0.contains((java.lang.Object) 0.0d);
        boolean boolean8 = objList0.contains((java.lang.Object) 10);
        boolean boolean10 = objList0.contains((java.lang.Object) true);
        java.util.ArrayList<java.util.AbstractList<java.lang.Object>> objListList11 = new java.util.ArrayList<java.util.AbstractList<java.lang.Object>>();
        boolean boolean12 = objList0.contains((java.lang.Object) objListList11);
        java.util.ArrayList<java.util.AbstractList<java.lang.Object>> objListList13 = new java.util.ArrayList<java.util.AbstractList<java.lang.Object>>();
        boolean boolean14 = objList0.contains((java.lang.Object) objListList13);
        java.util.ArrayList<java.util.ArrayList<java.lang.Object>> objListList15 = new java.util.ArrayList<java.util.ArrayList<java.lang.Object>>();
        boolean boolean16 = objList0.contains((java.lang.Object) objListList15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }
}

