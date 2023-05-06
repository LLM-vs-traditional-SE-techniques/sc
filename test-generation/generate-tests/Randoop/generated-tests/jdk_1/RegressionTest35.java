import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest35 {

    public static boolean debug = false;

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest35.test36");
        java.lang.Object obj2 = new java.lang.Object();
        java.lang.Object[] objArray22 = new java.lang.Object[] { 100.0d, 0.0f, obj2, false, (byte) 0, (byte) 1, 100.0f, (-1.0d), 0, 100.0d, (short) 1, ' ', 100.0f, 0.0f, (byte) 10, (-1.0d), (byte) 0, 0.0d, (short) 10, (short) -1, 10L, '#' };
        java.util.ArrayList<java.lang.Object> objList23 = new java.util.ArrayList<java.lang.Object>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<java.lang.Object>) objList23, objArray22);
        java.lang.Object obj26 = objList23.remove(0);
        java.lang.Object obj28 = objList23.remove(10);
        java.lang.Object obj30 = objList23.remove((int) (byte) 0);
        java.lang.Object obj32 = objList23.remove((int) (short) 1);
        java.lang.Object obj34 = objList23.remove((int) (byte) 10);
        java.lang.Object obj36 = objList23.remove(10);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + obj26 + "' != '" + 100.0d + "'", obj26, 100.0d);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + ' ' + "'", obj28, ' ');
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + 0.0f + "'", obj30, 0.0f);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + false + "'", obj32, false);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + (byte) 10 + "'", obj34, (byte) 10);
        org.junit.Assert.assertEquals("'" + obj36 + "' != '" + (-1.0d) + "'", obj36, (-1.0d));
    }
}

