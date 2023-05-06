import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest3 {

    public static boolean debug = false;

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest3.test04");
        org.elasticsearch.action.index.IndexRequest indexRequest0 = new org.elasticsearch.action.index.IndexRequest();
        org.elasticsearch.common.xcontent.XContentType xContentType1 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType2 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType3 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType4 = indexRequest0.getContentType();
        org.elasticsearch.common.xcontent.XContentType xContentType5 = indexRequest0.getContentType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = indexRequest0.sourceAsMap();
    }
}

