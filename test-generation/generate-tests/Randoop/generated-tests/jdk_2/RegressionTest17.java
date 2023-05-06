import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest17 {

    public static boolean debug = false;

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest17.test18");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.lang.Object obj3 = new java.lang.Object();
        java.lang.Object[] objArray23 = new java.lang.Object[] { 100.0d, 0.0f, obj3, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList24, objArray23);
        boolean boolean27 = objList24.contains((java.lang.Object) 10.0d);
        boolean boolean29 = objList24.contains((java.lang.Object) 1.0d);
        boolean boolean31 = objList24.contains((java.lang.Object) (-1.0f));
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList32 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean33 = objList24.contains((java.lang.Object) strComparableList32);
        boolean boolean34 = objList0.contains((java.lang.Object) objList24);
        java.util.ArrayList<java.lang.Object> objList35 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean37 = objList35.contains((java.lang.Object) (-1.0d));
        boolean boolean39 = objList35.contains((java.lang.Object) 100.0d);
        boolean boolean41 = objList35.contains((java.lang.Object) 0.0d);
        boolean boolean43 = objList35.contains((java.lang.Object) 10);
        boolean boolean45 = objList35.contains((java.lang.Object) true);
        java.util.ArrayList<java.util.AbstractList<java.lang.Object>> objListList46 = new java.util.ArrayList<java.util.AbstractList<java.lang.Object>>();
        boolean boolean47 = objList35.contains((java.lang.Object) objListList46);
        boolean boolean48 = objList24.contains((java.lang.Object) objListList46);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }
}

