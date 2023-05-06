import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_40 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
        assertNotNull(handler);
        GWT.setUncaughtExceptionHandler(null);
        try {
            GWT.log("test uncaught exception", new NullPointerException("expected"));
            fail("expected an uncaught exception");
        } catch (NullPointerException expected) {
        } finally {
            GWT.setUncaughtExceptionHandler(handler);
        }
    }
}