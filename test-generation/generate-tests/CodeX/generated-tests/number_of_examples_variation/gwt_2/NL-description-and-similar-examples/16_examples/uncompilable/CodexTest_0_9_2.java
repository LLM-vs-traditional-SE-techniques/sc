import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_2 { 
  @Test
    public void testGetUncaughtExceptionHandlerFailFast() {
        UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
            @Override
            public void onUncaughtException(Throwable ex) {
                //safeThrow(ex);
            }
        };
        GWT.setUncaughtExceptionHandler(handler);
        GWT.getUncaughtExceptionHandler();
    }
}