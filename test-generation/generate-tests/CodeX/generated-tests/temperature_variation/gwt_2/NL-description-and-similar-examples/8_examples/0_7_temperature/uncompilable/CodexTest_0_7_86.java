import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_86 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException(e);
      }
    };
    GWT.setUncaughtExceptionHandler(handler);
    try {
      assertEquals(handler, GWT.getUncaughtExceptionHandler());
      throw new RuntimeException("Expected RuntimeException from handler");
    } catch (RuntimeException e) {
      assertEquals("Expected RuntimeException from handler", e.getMessage());
    } finally {
      GWT.setUncaughtExceptionHandler(null);
    }
  }
}