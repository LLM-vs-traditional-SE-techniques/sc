import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_50 { 
  @Test
  public void testUncaughtException() {
    final RuntimeException runtimeException = new RuntimeException();
    UncaughtExceptionHandler exceptionHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals(runtimeException, e);
      }
    };
    GWT.setUncaughtExceptionHandler(exceptionHandler);
    UncaughtExceptionHandler.getUncaughtExceptionHandler().onUncaughtException(runtimeException);
    GWT.setUncaughtExceptionHandler(null);
  }
}