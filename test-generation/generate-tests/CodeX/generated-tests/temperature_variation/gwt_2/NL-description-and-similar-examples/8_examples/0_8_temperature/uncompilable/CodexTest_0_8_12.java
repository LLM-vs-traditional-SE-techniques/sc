import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_12 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    assertNotNull("UncaughtExceptionHandler must not be null", handler);
    try {
      double d = seven / zero;
      fail("Expected ArithmeticException");
    } catch (ArithmeticException expected) {
      if (!GWT.isScript()) {
        assertNotNull("UncaughtExceptionHandler must not be null", handler);
      }
    }
  }
}