import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest9 {

    public static boolean debug = false;

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test10");
        org.elasticsearch.action.index.IndexRequest indexRequest0 = new org.elasticsearch.action.index.IndexRequest();
        org.elasticsearch.common.xcontent.XContentType xContentType1 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType2 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType3 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType4 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType5 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType6 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType7 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType8 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType9 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType10 = indexRequest0.getContentType();
        java.util.Map map11 = null;
        org.elasticsearch.common.xcontent.XContentType xContentType12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.action.index.IndexRequest indexRequest13 = indexRequest0.source(map11, xContentType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No matching content type for null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(xContentType1);
        org.junit.Assert.assertNull(xContentType2);
        org.junit.Assert.assertNull(xContentType3);
        org.junit.Assert.assertNull(xContentType4);
        org.junit.Assert.assertNull(xContentType5);
        org.junit.Assert.assertNull(xContentType6);
        org.junit.Assert.assertNull(xContentType7);
        org.junit.Assert.assertNull(xContentType8);
        org.junit.Assert.assertNull(xContentType9);
        org.junit.Assert.assertNull(xContentType10);
    }
}

