import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_70 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        UncaughtExceptionHandler handler1 = GWT.getUncaughtExceptionHandler();
        UncaughtExceptionHandler handler2 = GWT.getUncaughtExceptionHandler();
        assertEquals(handler1, handler2);
        UncaughtExceptionHandler handler3 = new UncaughtExceptionHandler() {
            @Override
            public void onUncaughtException(Throwable e) {
                e.printStackTrace();
            }
        };
        GWT.setUncaughtExceptionHandler(handler3);
        UncaughtExceptionHandler handler4 = GWT.getUncaughtExceptionHandler();
        assertEquals(handler3, handler4);
    }
}