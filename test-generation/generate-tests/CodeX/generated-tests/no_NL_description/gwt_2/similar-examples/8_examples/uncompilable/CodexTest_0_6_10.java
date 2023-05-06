import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_6_10 { 
  @Test
  public void testUncaughtExceptionHandler() {
    UncaughtExceptionHandler oldHandler = Thread.getUncaughtExceptionHandler();
    try {
      assertNull(Thread.getUncaughtExceptionHandler());
      final Exception[] caughtException = new Exception[1];
      Thread.setUncaughtExceptionHandler(
          new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
              caughtException[0] = new Exception(e);
            }
          });
      assertNotNull(Thread.getUncaughtExceptionHandler());
      try {
        throw new RuntimeException("test");
      } catch (RuntimeException e) {
        // ignore
      }
      assertNotNull(caughtException[0]);
      assertNotNull(caughtException[0].getCause());
      assertEquals("test", caughtException[0].getCause().getMessage());
    } finally {
      Thread.setUncaughtExceptionHandler(oldHandler);
    }
  }
}