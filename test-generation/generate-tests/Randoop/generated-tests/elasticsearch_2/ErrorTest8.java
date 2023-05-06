import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest8 {

    public static boolean debug = false;

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest8.test09");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = indexRequest0.sourceAsMap();
    }
}

