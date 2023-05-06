import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest29 {

    public static boolean debug = false;

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest29.test30");
        org.hibernate.type.descriptor.java.BooleanTypeDescriptor booleanTypeDescriptor0 = new org.hibernate.type.descriptor.java.BooleanTypeDescriptor();
        java.lang.Boolean boolean2 = booleanTypeDescriptor0.fromString("");
        java.lang.Boolean boolean4 = booleanTypeDescriptor0.fromString("");
        java.lang.Boolean boolean6 = booleanTypeDescriptor0.fromString("hi!");
        java.lang.Boolean boolean8 = booleanTypeDescriptor0.fromString("hi!");
        java.lang.Boolean boolean10 = booleanTypeDescriptor0.fromString("");
        java.lang.Boolean boolean12 = booleanTypeDescriptor0.fromString("hi!");
        java.lang.Boolean boolean14 = booleanTypeDescriptor0.fromString("hi!");
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + false + "'", boolean14, false);
    }
}

