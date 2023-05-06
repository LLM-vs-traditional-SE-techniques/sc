import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_9_65 { 
  @Test
  public void testUncaughtExceptionHandler() throws Exception {
    Throwable exception = new Throwable();
    UncaughtExceptionHandler handlerResponse = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(final Throwable exception) {
        setResponse(exception);
      }
    };
    UncaughtExceptionHandler originalHandler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(handlerResponse);
      GWT.getUncaughtExceptionHandler().onUncaughtException(exception);
      assertEquals("Uncaught exception handler is not working", getResponse(), exception);
    } finally {
      GWT.setUncaughtExceptionHandler(originalHandler);
    }
    GWT.getUncaughtExceptionHandler().onUncaughtException(exception);
  }
}