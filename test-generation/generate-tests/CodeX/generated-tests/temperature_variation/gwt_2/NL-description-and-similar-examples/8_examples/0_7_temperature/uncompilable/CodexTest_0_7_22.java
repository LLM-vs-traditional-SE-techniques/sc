import com.google.gwt.core.client.*;
import com.google.gwt.core.client.impl.Impl;

import com.google.gwt.core.client.*;
import com.google.gwt.junit.client.GWTTestCase;
import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.*;


public class CodexTest_0_7_22 { 
  @Test
  public void testUncaughtExceptionHandler() {
    Thread.UncaughtExceptionHandler defaultHandler = Thread.getDefaultUncaughtExceptionHandler();
    try {
      final AtomicReference<Throwable> holder = new AtomicReference<Throwable>(null);
      Thread.UncaughtExceptionHandler handler = new Thread.UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
          holder.set(e);
        }
      };
      Thread.setDefaultUncaughtExceptionHandler(handler);
      try {
        throw new RuntimeException();
      } catch (RuntimeException e) {
        assertEquals("expected exception", e, holder.get());
      }
    } finally {
      Thread.setDefaultUncaughtExceptionHandler(defaultHandler);
    }
  }
}