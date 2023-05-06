import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_28 { 
  @Test
  public void testUncaughtExceptionHandler() throws Throwable {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertTrue(e instanceof ArithmeticException);
        assertEquals("/ by zero", e.getMessage());
      }
    });
    try {
      double d = seven / zero;
      fail("Expected ArithmeticException");
    } catch (ArithmeticException expected) {
      assertTrue(expected instanceof ArithmeticException);
      assertEquals("/ by zero", expected.getMessage());
    }
  }
}