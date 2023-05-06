import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        com.google.gwt.core.client.GWT.UncaughtExceptionHandler uncaughtExceptionHandler0 = com.google.gwt.core.client.GWT.getUncaughtExceptionHandler();
        org.junit.Assert.assertNull(uncaughtExceptionHandler0);
    }
}

