import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_9 { 
  @Test
    public void testUncaughtExceptionHandlerIsSet() {
        final AtomicBoolean handlerCalled = new AtomicBoolean(false);
        UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable e) {
                handlerCalled.set(true);
            }
        };
        UncaughtExceptionHandler originalHandler = getUncaughtExceptionHandler();
        GWT.setUncaughtExceptionHandler(handler);
        try {
            throw new RuntimeException("error");
        } catch (Throwable t) {
            GWT.onUncaughtException(t);
        }
        assertEquals("Handler was not called", true, handlerCalled.get());
        GWT.setUncaughtExceptionHandler(originalHandler);
    }

}