import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_33 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    GWT.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        assertEquals("expected exception", e.getMessage());
      }
    });
    try {
      throw new RuntimeException("expected exception");
    } catch (RuntimeException e) {
      GWT.reportUncaughtException(e);
    }
    GWT.setUncaughtExceptionHandler(handler);
  }
}