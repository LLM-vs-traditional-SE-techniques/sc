import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_2 { 
  @Test
    public void testUncaughtExceptionHandler() {
        final Throwable exception = new Throwable();
        final UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable ex) {
                assertSame(exception, ex);
            }
        };
        UncaughtExceptionHandler oldHandler =
            Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(handler);
        try {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(
                    Thread.currentThread(), exception);
        } finally {
            Thread.setDefaultUncaughtExceptionHandler(oldHandler);
        }
    }
}