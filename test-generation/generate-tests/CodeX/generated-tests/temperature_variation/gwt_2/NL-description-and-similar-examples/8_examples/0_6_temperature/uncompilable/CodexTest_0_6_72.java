import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_72 { 
  @Test
  public void testGetUncaughtExceptionHandler() {
    UncaughtExceptionHandler original = GWT.getUncaughtExceptionHandler();
    UncaughtExceptionHandler newHandler = new UncaughtExceptionHandler() {
      @Override
      public void onUncaughtException(Throwable e) {
        throw new RuntimeException("test");
      }
    };
    GWT.setUncaughtExceptionHandler(newHandler);
    try {
      try {
        throw new RuntimeException("test");
      } catch (RuntimeException e) {
        assertEquals("test", e.getMessage());
      }
    } finally {
      GWT.setUncaughtExceptionHandler(original);
    }
  }
}