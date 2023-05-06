import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_10 { 
  @Test
  public void testUncaughtExceptions() {
    UncaughtExceptionHandler originalHandler =
        GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(
        new UncaughtExceptionHandler() {
          @Override
          public void onUncaughtException(Throwable e) {
            caughtException = e;
          }
        });
    try {
      // Throw an exception.
      throw new RuntimeException("Boom!");
    } finally {
      GWT.setUncaughtExceptionHandler(originalHandler);
    }
    assertNotNull(caughtException);
    assertEquals("Boom!", caughtException.getMessage());
  }
}