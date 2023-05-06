import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_64 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        UncaughtExceptionHandler h1 = new UncaughtExceptionHandler() {
            public void onUncaughtException(Throwable e) {
            }
        };
        UncaughtExceptionHandler h2 = new UncaughtExceptionHandler() {
            public void onUncaughtException(Throwable e) {
            }
        };
        GWT.setUncaughtExceptionHandler(h1);
        assertEquals(h1, GWT.getUncaughtExceptionHandler());
        GWT.setUncaughtExceptionHandler(h2);
        assertEquals(h2, GWT.getUncaughtExceptionHandler());
        GWT.setUncaughtExceptionHandler(null);
        assertNull(GWT.getUncaughtExceptionHandler());
    }
}