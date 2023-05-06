import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_5_88 { 
  @Test
  public void testSetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException("This exception should not be thrown");
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    try {
      throw new RuntimeException("testSetUncaughtExceptionHandler");
    } catch (RuntimeException e) {
      UncaughtExceptionHandler newHandler = GWT.getUncaughtExceptionHandler();
      assertEquals("The uncaught exception handler is not the same", handler, newHandler);
    }
  }
}