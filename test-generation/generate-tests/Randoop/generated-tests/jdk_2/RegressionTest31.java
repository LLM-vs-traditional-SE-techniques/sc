import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest31 {

    public static boolean debug = false;

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest31.test32");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        java.util.ArrayList<java.lang.Object> objList1 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean3 = objList1.contains((java.lang.Object) (-1.0d));
        boolean boolean5 = objList1.contains((java.lang.Object) 100.0d);
        boolean boolean7 = objList1.contains((java.lang.Object) 10L);
        boolean boolean9 = objList1.contains((java.lang.Object) 10.0f);
        java.lang.Object obj12 = new java.lang.Object();
        java.lang.Object[] objArray17 = new java.lang.Object[] { 100.0f, 0.0f, obj12, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList18 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList18, objArray17);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList20 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean21 = objList18.contains((java.lang.Object) objIterableList20);
        boolean boolean22 = objList1.contains((java.lang.Object) boolean21);
        boolean boolean23 = objList0.contains((java.lang.Object) boolean21);
        java.util.ArrayList<java.lang.Object> objList24 = new java.util.ArrayList<java.lang.Object>();
        java.lang.Object obj27 = new java.lang.Object();
        java.lang.Object[] objArray47 = new java.lang.Object[] { 100.0d, 0.0f, obj27, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList48 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList48, objArray47);
        boolean boolean51 = objList48.contains((java.lang.Object) 10.0d);
        boolean boolean53 = objList48.contains((java.lang.Object) 1.0d);
        boolean boolean55 = objList48.contains((java.lang.Object) (-1.0f));
        java.util.ArrayList<java.lang.Comparable<java.lang.String>> strComparableList56 = new java.util.ArrayList<java.lang.Comparable<java.lang.String>>();
        boolean boolean57 = objList48.contains((java.lang.Object) strComparableList56);
        boolean boolean58 = objList24.contains((java.lang.Object) objList48);
        boolean boolean59 = objList0.contains((java.lang.Object) boolean58);
        java.util.ArrayList<java.lang.Object> objList60 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean62 = objList60.contains((java.lang.Object) (-1.0d));
        boolean boolean64 = objList60.contains((java.lang.Object) 100.0d);
        boolean boolean66 = objList60.contains((java.lang.Object) 10L);
        java.lang.Object obj67 = null;
        boolean boolean68 = objList60.contains(obj67);
        java.lang.Object obj71 = new java.lang.Object();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 100.0f, 0.0f, obj71, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList77 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList77, objArray76);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList79 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean80 = objList77.contains((java.lang.Object) objIterableList79);
        boolean boolean81 = objList60.contains((java.lang.Object) objList77);
        boolean boolean82 = objList0.contains((java.lang.Object) objList60);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
    }
}

