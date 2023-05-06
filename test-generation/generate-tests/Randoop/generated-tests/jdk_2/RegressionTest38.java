import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest38 {

    public static boolean debug = false;

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest38.test39");
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
        boolean boolean26 = objList24.contains((java.lang.Object) (-1.0d));
        boolean boolean28 = objList24.contains((java.lang.Object) 100.0d);
        boolean boolean30 = objList24.contains((java.lang.Object) 0.0d);
        boolean boolean31 = objList0.contains((java.lang.Object) objList24);
        java.util.ArrayList<java.lang.Object> objList32 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean34 = objList32.contains((java.lang.Object) (-1.0d));
        boolean boolean36 = objList32.contains((java.lang.Object) 100.0d);
        boolean boolean38 = objList32.contains((java.lang.Object) 10L);
        boolean boolean40 = objList32.contains((java.lang.Object) 10.0f);
        java.util.ArrayList<java.lang.Object> objList41 = new java.util.ArrayList<java.lang.Object>();
        java.util.ArrayList<java.lang.Object> objList42 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean44 = objList42.contains((java.lang.Object) (-1.0d));
        boolean boolean46 = objList42.contains((java.lang.Object) 100.0d);
        boolean boolean48 = objList42.contains((java.lang.Object) 10L);
        boolean boolean50 = objList42.contains((java.lang.Object) 10.0f);
        java.lang.Object obj53 = new java.lang.Object();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 100.0f, 0.0f, obj53, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList59 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList59, objArray58);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList61 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean62 = objList59.contains((java.lang.Object) objIterableList61);
        boolean boolean63 = objList42.contains((java.lang.Object) boolean62);
        boolean boolean64 = objList41.contains((java.lang.Object) boolean62);
        boolean boolean65 = objList32.contains((java.lang.Object) objList41);
        boolean boolean66 = objList24.contains((java.lang.Object) objList41);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }
}

