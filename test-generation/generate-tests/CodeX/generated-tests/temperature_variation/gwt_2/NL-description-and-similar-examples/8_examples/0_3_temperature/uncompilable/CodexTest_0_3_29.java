import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_29 { 
  @Test
  private static class TestUncaughtExceptionHandler implements UncaughtExceptionHandler {
    @Override
    public void onUncaughtException(Throwable e) {
      throw new RuntimeException(e);
    }
  }
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler handler = GWT.getUncaughtExceptionHandler();
    try {
      GWT.setUncaughtExceptionHandler(new TestUncaughtExceptionHandler());
      try {
        throw new RuntimeException();
      } catch (RuntimeException e) {
        assertTrue(e.getCause() instanceof RuntimeException);
      }
    } finally {
      GWT.setUncaughtExceptionHandler(handler);
    }
  }
}