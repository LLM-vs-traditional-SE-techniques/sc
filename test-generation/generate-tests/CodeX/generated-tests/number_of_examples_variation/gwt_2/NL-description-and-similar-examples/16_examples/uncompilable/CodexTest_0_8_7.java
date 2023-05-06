import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_7 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        UncaughtExceptionHandler myHandler = new UncaughtExceptionHandler() {
            @Override
            public void onUncaughtException(Throwable e) {
                // do nothing
            }
        };
        GWT.setUncaughtExceptionHandler(myHandler);
        assertEquals(GWT.getUncaughtExceptionHandler(), myHandler);
        // Restore the default.
        GWT.setUncaughtExceptionHandler(GWT.getUncaughtExceptionHandler());
    }
}