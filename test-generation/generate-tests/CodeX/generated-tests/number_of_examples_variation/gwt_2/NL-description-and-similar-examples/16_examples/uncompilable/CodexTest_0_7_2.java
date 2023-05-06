import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_2 { 
  @Test
    public void testGetUncaughtExceptionHandler() {
        final UncaughtExceptionHandler defaultErrorHandler = GWT.getUncaughtExceptionHandler();
        final UncaughtExceptionHandler[] customErrorHandler = new UncaughtExceptionHandler[1];
        GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
          @Override
          public void onUncaughtException(Throwable e) {
            customErrorHandler[0] = GWT.getUncaughtExceptionHandler();
          }
        });
        GWT.setUncaughtExceptionHandler(defaultErrorHandler);
        assertSame(defaultErrorHandler, customErrorHandler[0]);
      }
}