import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_8_45 { 
  @Test
  public void testUncaughtException() throws Exception {
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals(ArithmeticException.class, e.getClass());
        assertEquals("/ by zero", e.getMessage());
      }
    });
    calculate();
    UncaughtExceptionHandler uncaughtExceptionHandler = GWT.getUncaughtExceptionHandler();
    assertNotNull(uncaughtExceptionHandler);
  }
}