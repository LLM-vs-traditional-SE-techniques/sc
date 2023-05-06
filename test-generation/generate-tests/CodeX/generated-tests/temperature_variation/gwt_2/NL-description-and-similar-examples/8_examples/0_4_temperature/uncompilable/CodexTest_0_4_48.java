import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_4_48 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals(ArithmeticException.class, e.getClass());
        assertEquals("/ by zero", e.getMessage());
      }
    });
    try {
      double d = seven / zero;
    } catch (Throwable e) {
      // ignore
    }
    GWT.setUncaughtExceptionHandler(handler);
  }
}