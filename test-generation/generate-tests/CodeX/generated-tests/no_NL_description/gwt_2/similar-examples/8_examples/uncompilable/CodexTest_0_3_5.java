import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_3_5 { 
  @Test
  public void testUncaughtExceptionHandler() {
    final UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    final UncaughtExceptionHandler handler = new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        throw new RuntimeException("Expected exception", e);
      }
    };
    Thread.setDefaultUncaughtExceptionHandler(handler);
    try {
      // This should throw an exception because the default handler is set to handler.
      Thread.UncaughtExceptionHandlerUtil.logUncaughtException(new RuntimeException("Expected exception"));
      fail("Expected exception");
    } catch (RuntimeException e) {
      assertEquals("Expected exception", e.getCause().getMessage());
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(defaultHandler);
    }
  }
}