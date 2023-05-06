import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test24");
        java.util.ArrayList<java.lang.Object> objList0 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean2 = objList0.contains((java.lang.Object) (-1.0d));
        java.util.ArrayList<java.lang.Object> objList3 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean5 = objList3.contains((java.lang.Object) (-1.0d));
        boolean boolean7 = objList3.contains((java.lang.Object) 100.0d);
        boolean boolean9 = objList3.contains((java.lang.Object) 10L);
        boolean boolean10 = objList0.contains((java.lang.Object) objList3);
        java.lang.Object obj13 = new java.lang.Object();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 100.0d, 0.0f, obj13, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList34 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList34, objArray33);
        boolean boolean37 = objList34.contains((java.lang.Object) 10.0d);
        boolean boolean39 = objList34.contains((java.lang.Object) 1.0d);
        boolean boolean41 = objList34.contains((java.lang.Object) (-1.0f));
        java.util.ArrayList<java.lang.Object> objList42 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean44 = objList42.contains((java.lang.Object) (-1.0d));
        boolean boolean46 = objList42.contains((java.lang.Object) 100.0d);
        boolean boolean48 = objList42.contains((java.lang.Object) 10L);
        boolean boolean50 = objList42.contains((java.lang.Object) 10.0f);
        java.util.ArrayList<java.lang.Object> objList51 = new java.util.ArrayList<java.lang.Object>();
        java.util.ArrayList<java.lang.Object> objList52 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean54 = objList52.contains((java.lang.Object) (-1.0d));
        boolean boolean56 = objList52.contains((java.lang.Object) 100.0d);
        boolean boolean58 = objList52.contains((java.lang.Object) 10L);
        boolean boolean60 = objList52.contains((java.lang.Object) 10.0f);
        java.lang.Object obj63 = new java.lang.Object();
        java.lang.Object[] objArray68 = new java.lang.Object[] { 100.0f, 0.0f, obj63, (-1L), true, 100L, (byte) 1 };
        java.util.ArrayList<java.lang.Object> objList69 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList69, objArray68);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList71 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        boolean boolean72 = objList69.contains((java.lang.Object) objIterableList71);
        boolean boolean73 = objList52.contains((java.lang.Object) boolean72);
        boolean boolean74 = objList51.contains((java.lang.Object) boolean72);
        boolean boolean75 = objList42.contains((java.lang.Object) objList51);
        boolean boolean76 = objList34.contains((java.lang.Object) objList51);
        java.util.ArrayList<java.util.AbstractCollection<java.lang.Object>> objCollectionList77 = new java.util.ArrayList<java.util.AbstractCollection<java.lang.Object>>();
        boolean boolean78 = objList34.contains((java.lang.Object) objCollectionList77);
        boolean boolean79 = objList0.contains((java.lang.Object) boolean78);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
    }
}

