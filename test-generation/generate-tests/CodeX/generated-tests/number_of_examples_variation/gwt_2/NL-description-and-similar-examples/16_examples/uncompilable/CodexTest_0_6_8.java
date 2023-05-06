import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_8 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        GWTTestCase.setUncaughtExceptionHandler(null);
        assertNull(GWTTestCase.getUncaughtExceptionHandler());
        GWTTestCase.UncaughtExceptionHandler handler = new GWTTestCase.UncaughtExceptionHandler() {
            public void onUncaughtException(Throwable e) {
            }
        };
        GWTTestCase.setUncaughtExceptionHandler(handler);
        assertSame(handler, GWTTestCase.getUncaughtExceptionHandler());
    }
}