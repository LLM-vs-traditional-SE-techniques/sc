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
        java.util.ArrayList<java.util.ArrayList<java.lang.Object>> objListList2 = new java.util.ArrayList<java.util.ArrayList<java.lang.Object>>();
        java.lang.Object obj14 = new java.lang.Object();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 100.0d, 0.0f, obj14, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList35 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList35, objArray34);
        java.lang.Object obj38 = objList35.remove(0);
        java.lang.Object obj40 = objList35.remove((int) (byte) 10);
        java.util.ArrayList<java.lang.Iterable<java.lang.Object>> objIterableList42 = new java.util.ArrayList<java.lang.Iterable<java.lang.Object>>();
        java.lang.Object obj49 = new java.lang.Object();
        java.lang.Object[] objArray69 = new java.lang.Object[] { 100.0d, 0.0f, obj49, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList70 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList70, objArray69);
        java.lang.Object obj73 = objList70.remove(0);
        java.lang.Object obj75 = objList70.remove((int) (byte) 10);
        java.lang.Object obj77 = objList70.remove((int) (byte) 0);
        java.lang.Object[] objArray79 = new java.lang.Object[] { '4', 1.0d, objListList2, (byte) 1, (byte) 100, (byte) 1, 'a', (short) 100, 100.0f, (-1.0f), (-1.0f), (short) 100, obj40, 10.0f, objIterableList42, 100, 100.0d, '#', (byte) 100, objList70, 1L };
        java.util.ArrayList<java.lang.Object> objList80 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList80, objArray79);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Object obj83 = objList80.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertEquals("'" + obj38 + "' != '" + 100.0d + "'", obj38, 100.0d);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + ' ' + "'", obj40, ' ');
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertEquals("'" + obj73 + "' != '" + 100.0d + "'", obj73, 100.0d);
        org.junit.Assert.assertEquals("'" + obj75 + "' != '" + ' ' + "'", obj75, ' ');
        org.junit.Assert.assertEquals("'" + obj77 + "' != '" + 0.0f + "'", obj77, 0.0f);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }
}

