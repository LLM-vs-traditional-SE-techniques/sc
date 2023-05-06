import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_7 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    Thread.setDefaultUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        fail("Unexpected uncaught exception from thread: " + t + ": " + e);
      }
    });
    final RuntimeException expected = new RuntimeException("Expected exception");
    assertNull(Thread.getUncaughtExceptionHandler());
    Thread.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
      @Override
      public void uncaughtException(Thread t, Throwable e) {
        assertSame(expected, e);
      }
    });
    assertNotNull(Thread.getUncaughtExceptionHandler());
    Thread.currentThread().getThreadGroup().uncaughtException(Thread.currentThread(), expected);
    Thread.setUncaughtExceptionHandler(null);
    Thread.currentThread().getThreadGroup().uncaughtException(Thread.currentThread(), expected);
    Thread.setDefaultUncaughtExceptionHandler(defaultHandler);
  }
}