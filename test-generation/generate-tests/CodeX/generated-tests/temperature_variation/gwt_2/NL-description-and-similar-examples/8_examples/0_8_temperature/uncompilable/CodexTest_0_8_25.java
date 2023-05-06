import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_25 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    // This test is guaranted to cause an uncaught exception because of the
    // division by zero.
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException(e);
      }
    });
    try {
      double d = seven / zero;
      if (GWT.getUncaughtExceptionHandler() == null) {
        fail("Expected uncaught exception");
      }
    } catch (ArithmeticException expected) {
      assertNotNull(GWT.getUncaughtExceptionHandler());
    }
  }
}